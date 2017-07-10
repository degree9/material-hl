(ns material-hl.form-field
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]
            [goog.dom.classlist :as gcl]))

(hl/defelem form-field [attr kids]
  (let []
    (hl/div (core/assoc-class attr {:mdc-form-field true})
      kids)))
