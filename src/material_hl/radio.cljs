(ns material-hl.checkbox
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]
            [hoplon.svg :as svg]))

(def ^:dynamic *disabled* nil)

(defelem checkbox [attr kids]
  (let [dark     (:dark     attr *dark*)
        disabled (:disabled attr *disabled*)]
    (hl/div
      (core/assoc-class attr
        {:mdc-radio           true
         :mdc-radio--disabled disabled})
      (hl/input :type "radio" :class [:mdc-radio__native-control])
      (hl/div :class [:mdc-radio__background]
        (hl/div :class [:mdc-radio__outer-circle])
        (hl/div :class [:mdc-radio__inner-circle])))))
