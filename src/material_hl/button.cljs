(ns material-hl.button
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]))

(def ^:dynamic *accent*  nil)
(def ^:dynamic *compact* nil)
(def ^:dynamic *dense*   nil)
(def ^:dynamic *primary* nil)
(def ^:dynamic *raised*  nil)

(hl/defelem button [attr kids]
  (let [accent  (:accent  attr *accent*)
        compact (:compact attr *compact*)
        dense   (:dense   attr *dense*)
        primary (:primary attr *primary*)
        raised  (:raised  attr *raised*)]
    (hl/button
      (core/assoc-class attr
        {:mdc-button          true
         :mdc-button--accent  accent
         :mdc-button--compact compact
         :mdc-button--dense   dense
         :mdc-button--primary primary
         :mdc-button--raised  raised})
      kids)))
