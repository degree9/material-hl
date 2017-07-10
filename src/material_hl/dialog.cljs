(ns material-hl.dialog
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]
            [material-hl.button :as btn]))

(def ^:dynamic *scrollable* false)
(def ^:dynamic *cancel* false)
(def ^:dynamic *accept* false)

(hl/defelem dialog [attr kids]
  (let [attr (assoc attr :role "alertdialog")]
    (hl/aside (core/assoc-class attr {:mdc-dialog true}
                                      :mdc-dialog--scrollable scrollable)
      kids)))

(hl/defelem surface [attr kids]
  (let []
    (hl/div (core/assoc-class attr {:mdc-dialog__surface true})
      kids)))

(hl/defelem header [attr kids]
  (let []
    (hl/header (core/assoc-class attr {:mdc-dialog__header true})
      kids)))

(hl/defelem header-title [attr kids]
  (let []
    (hl/h2 (core/assoc-class attr {:mdc-dialog__header__title true})
      kids)))

(hl/defelem body [attr kids]
  (let [scrollable (:scrollable attr *scrollable*)]
    (hl/section (core/assoc-class attr {:mdc-dialog__body true
                                        :mdc-dialog__body--scrollable scrollable})
      kids)))

(hl/defelem footer [attr kids]
  (let []
    (hl/footer (core/assoc-class attr {:mdc-dialog__footer true})
      kids)))

(hl/defelem footer-button [attr kids]
  (let [accept (:accept attr *accept*)
        cancel (:cancel attr *cancel*)]
    (btn/button (core/assoc-class attr {:mdc-dialog__footer__button true
                                        :mdc-dialog__footer__button--accept accept
                                        :mdc-dialog__footer__button--cancel cancel})
      kids)))

(hl/defelem backdrop [attr kids]
  (let []
    (hl/div (core/assoc-class attr {:mdc-dialog__backdrop true})
      kids)))
