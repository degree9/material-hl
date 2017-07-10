(ns material-hl.switch
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]
            [material-hl.button :as btn]
            [cljsjs.material-components]))

(def ^:dynamic *disabled* nil)

(defelem switch [attr kids]
  (let [disabled (:disabled attr *disabled*)]
    (hl/div
      (core/assoc-class (dissoc attr :id)
        {:mdc-switch true
         :mdc-switch--disabled disabled})
      (hl/input :type "checkbox" :id (:id attr) :class [:mdc-switch__native-control] :disabled disabled)
      (hl/div :class [:mdc-switch__background]
        (hl/div :class [:mdc-switch__knob])))))

(defelem switch-label [attr kids]
  (let []
    (hl/div
      (core/assoc-class attr
        {:mdc-switch-label true})
      kids)))
