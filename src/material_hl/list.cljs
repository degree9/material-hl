(ns material-hl.list
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]))

(def ^:dynamic *dense*    nil)
(def ^:dynamic *two-line* nil)
(def ^:dynamic *avatar*   nil)
(def ^:dynamic *start*    nil)
(def ^:dynamic *end*      nil)
(def ^:dynamic *inset*    nil)

(hl/defelem list [attr kids]
  (let [dense    (:dense    attr *dense*)
        two-line (:two-line attr *two-line*)
        avatar   (:avatar   attr *avatar*)]
    (hl/ul
      (core/assoc-class attr
        {:mdc-list              true
         :mdc-list--dense       dense
         :mdc-list--two-line    two-line
         :mdc-list--avatar-list avatar})
      kids)))

(hl/defelem list-item [attr kids]
  (let []
    (hl/li
      (core/assoc-class attr
        {:mdc-list-item true})
      kids)))

(hl/defelem list-item-text [attr kids]
  (let []
    (hl/span
      (core/assoc-class attr
        {:mdc-list-item__text true})
      kids)))

(hl/defelem list-item-text-primary [attr kids]
  (let []
    (hl/span
      (core/assoc-class attr
        {:mdc-list-item__text__primary true})
      kids)))

(hl/defelem list-item-text-secondary [attr kids]
  (let []
    (hl/span
      (core/assoc-class attr
        {:mdc-list-item__text__secondary true})
      kids)))

(hl/defelem list-item-detail [attr kids]
  (let [start (:start attr  *start*)
        end   (:end   attr  *end*)]
    (hl/span
      (core/assoc-class attr
        {:mdc-list-item__end-detail   end
         :mdc-list-item__start-detail (or start true)})
      kids)))

(hl/defelem list-divider [attr kids]
  (let [inset (:inset attr *inset*)]
    (hl/li
      (-> attr
        (assoc :role "separator")
        (core/assoc-class
          {:mdc-list-divider        true
           :mdc-list-divider--inset inset}))
      kids)))

(hl/defelem list-group [attr kids]
  (let []
    (hl/div
      (core/assoc-class attr
        {:mdc-list-group true})
      kids)))

(hl/defelem list-group-subheader [attr kids]
  (let []
    (hl/h3
      (core/assoc-class attr
        {:mdc-list-group__subheader true})
      kids)))
