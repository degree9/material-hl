(ns material-hl.fab
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]))

(def ^:dynamic *mini*  false)
(def ^:dynamic *plain* false)

(hl/defelem fab [attr kids]
  (let [mini  (:mini  attr *mini*)
        plain (:plain attr *plain*)]
    (hl/button
      (core/assoc-class attr
        {:mdc-fab        true
         :mdc-fab--mini  mini
         :mdc-fab--plain plain})
      (hl/span :class [:mdc-fab__icon] kids))))
