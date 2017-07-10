(ns material-hl.elevation
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]))

(defmethod hoplon.core/do! :elevation
  [elem _ v]
  (let []
    (when v
      (hoplon.core/do! elem :class {(keyword (str "mdc-elevation--z" v)) true}))))
