(ns material-hl.checkbox
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]
            [hoplon.svg :as svg]))

(def ^:dynamic *dark* nil)

(hl/defelem checkbox [attr kids]
  (let [dark (:dark attr *dark*)]
    (hl/div
      (core/assoc-class attr
        {:mdc-checkbox             true
         :mdc-checkbox--theme-dark dark})
      (hl/input :type "checkbox" :class [:mdc-checkbox__native-control])
      (hl/div :class [:mdc-checkbox__background]
        (svg/svg :version "1.1" :class [:mdc-checkbox__checkmark]
          :svg/viewBox "0 0 24 24" :xml:space "preserve"
          (svg/path :class [:mdc-checkbox__checkmark__path] :fill "none"
            :stroke "white" :d "M1.73,12.91 8.1,19.28 22.79,4.59"))
        (hl/div :class [:mdc-checkbox__mixedmark])))))
