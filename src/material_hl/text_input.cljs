(ns material-hl.text-input
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]
            [goog.dom.classlist :as gcl]))

;(def ^:dynamic *floating-label* false)
(def ^:dynamic *multiline* false)

(hl/defelem textfield [attr kids]
  (let [multiline (:multiline attr *multiline*)]
    (hl/div (core/assoc-class attr {:mdc-textfield true
                                    :multiline multiline})
      kids)))

(hl/defelem input [attr kids]
  (let []
    (hl/input (core/assoc-class attr {:mdc-textfield__input true})
      kids)))

(hl/defelem label [attr kids]
  (let []
    (hl/label (core/assoc-class attr {:mdc-textfield__label true})
      kids)))

(hl/defelem textarea [attr kids]
  (let []
    (hl/textarea (core/assoc-class attr {:mdl-textfield__input true})
      kids)))
