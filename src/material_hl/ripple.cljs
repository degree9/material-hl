(ns material-hl.ripple
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]
            [cljsjs.material-components]))

(defelem ripple [attr kids]
  (let []
    (hl/div
      (core/assoc-class attr
        {:mdc-ripple-surface true})
      kids)))

(defmethod hoplon.core/do! :ripple
  [elem _ v]
  (let [ripple js/mdc.ripple.MDCRipple]
    (when v
      (.attachTo ripple elem))))
