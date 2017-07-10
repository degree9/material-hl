(ns material-hl.layout-grid
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]))

(def ^:dynamic *columns*         nil)
(def ^:dynamic *desktop-columns* nil)
(def ^:dynamic *tablet-columns*  nil)
(def ^:dynamic *phone-columns*   nil)
(def ^:dynamic *order*           nil)
(def ^:dynamic *align*           nil)

(hl/defelem grid [attr kids]
  (let []
    (hl/div
      (core/assoc-class attr
        {:mdc-layout-grid true})
      kids)))

(hl/defelem cell [attr kids]
  (let [columns           (:columns         attr *columns*)
        desktop-columns   (:desktop-columns attr *desktop-columns*)
        tablet-columns    (:tablet-columns  attr *tablet-columns*)
        phone-columns     (:phone-columns   attr *phone-columns*)
        order             (:order           attr *order*)
        align             (:align           attr *align*)]
    (hl/div
      (core/assoc-class attr
        {:mdc-layout-grid__cell                                                     true
         (keyword (str "mdc-layout-grid__cell--span-"  columns))                    columns
         (keyword (str "mdc-layout-grid__cell--span-"  desktop-columns "-desktop")) desktop-columns
         (keyword (str "mdc-layout-grid__cell--span-"  tablet-columns  "-tablet"))  tablet-columns
         (keyword (str "mdc-layout-grid__cell--span-"  phone-columns   "-phone"))   phone-columns
         (keyword (str "mdc-layout-grid__cell--order-" order))                      order
         (keyword (str "mdc-layout-grid__cell--align-" align))                      align})
      kids)))
