(ns material-hl.core
  (:require [hoplon.core :as hl]
            [javelin.core :as j]
            [cljsjs.material-components]
            [goog.dom.classlist :as gcl]))

(def include-fonts #(hl/link :rel "stylesheet" :href "https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&lang=en" :type "text/css"))

(def include-icons #(hl/link :rel "stylesheet" :href "https://fonts.googleapis.com/icon?family=Material+Icons"))

(defn include-colors [primary accent]
  (hl/link :rel "stylesheet" :href (str "https://code.getmdl.io/1.1.3/material." (name primary) "-" (name accent) ".min.css")))

(defn normalize-class [kvs]
  (let [->map #(zipmap % (repeat true))]
    (if (map? kvs)
      kvs
      (->map (if (string? kvs) (.split kvs #"\s+") (seq kvs))))))

(defn assoc-class [attr & [pre post]]
  (let [class (:class attr)]
    (assoc attr :class (j/cell= (merge pre (normalize-class class) post)))))

;(defmethod hoplon.core/do! :upgrade
;  [elem _ v]
;  (when v
;    (.. js/componentHandler (upgradeElement elem))))
