(ns material-hl.snackbar
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]
            [material-hl.button :as btn]
            [cljsjs.material-components]))

(defelem snackbar [attr kids]
  (let []
    (hl/div :snackbar true
      (core/assoc-class attr
        {:mdc-snackbar true})
      kids)))

(defelem snackbar-text [attr kids]
  (let []
    (hl/div
      (core/assoc-class attr
        {:mdc-snackbar__text true})
      kids)))

(defelem snackbar-action-wrapper [attr kids]
  (let []
    (hl/div
      (core/assoc-class attr
        {:mdc-snackbar__action-wrapper true})
      kids)))

(defelem snackbar-action-button [attr kids]
  (let []
    (btn/button
      (core/assoc-class attr
        {:mdc-snackbar__action-button true})
      kids)))

(defmethod hoplon.core/do! :snackbar
  [elem _ v]
  (let [snackbar js/mdc.snackbar.MDCSnackbar]
    (when v
      (.attachTo snackbar elem))))
