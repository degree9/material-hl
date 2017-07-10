(ns material-hl.card
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]
            [material-hl.button :as btn]))

(def ^:dynamic *dark*     nil)
(def ^:dynamic *large*    nil)
(def ^:dynamic *size*     nil)
(def ^:dynamic *vertical* nil)

(hl/defelem card [attr kids]
  (let [dark (:dark attr *dark*)]
    (hl/div
      (core/assoc-class attr
        {:mdc-card             true
         :mdc-card--theme-dark dark})
      kids)))

(hl/defelem media [attr kids]
  (let []
    (hl/section
      (core/assoc-class attr
        {:mdc-card__media true})
      kids)))

(hl/defelem actions [attr kids]
  (let [vertical (:vertical attr *vertical*)]
    (hl/section
      (core/assoc-class attr
        {:mdc-card__actions           true
         :mdc-card__actions--vertical vertical})
      kids)))

(hl/defelem action [attr kids]
  (let []
    (btn/button
      (core/assoc-class attr
        {:mdc-card__action true}
        {:compact true})
      kids)))

(hl/defelem primary [attr kids]
  (let []
    (hl/section
      (core/assoc-class attr
        {:mdc-card__primary true})
      kids)))

(hl/defelem title [attr kids]
  (let [large (:large attr *large*)]
    (hl/h1
      (core/assoc-class attr
        {:mdc-card__title        true
         :mdc-card__title--large large})
      kids)))

(hl/defelem subtitle [attr kids]
  (let []
    (hl/h2
      (core/assoc-class attr
        {:mdc-card__subtitle true})
      kids)))

(hl/defelem supporting-text [attr kids]
  (let []
    (hl/section
      (core/assoc-class attr
        {:mdc-card__supporting-text true})
      kids)))

(hl/defelem horizontal-block [attr kids]
  (let []
    (hl/div
      (core/assoc-class attr
        {:mdc-card__horizontal-block true})
      kids)))

(hl/defelem media-item [attr kids]
  (let [size (:size attr *size*)]
    (hl/img
      (core/assoc-class attr
        {:mdc-card__media-item true
         (case size
           :1.5 :mdc-card__media-item--1dot5x
           :2   :mdc-card__media-item--2x
           :3   :mdc-card__media-item--3x) true})
      kids)))
