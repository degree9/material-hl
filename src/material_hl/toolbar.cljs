(ns material-hl.toolbar
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]))

(def ^:dynamic *fixed*     nil)
(def ^:dynamic *last-row*  nil)
(def ^:dynamic *flexible*  nil)
(def ^:dynamic *waterfall* nil)
(def ^:dynamic *start*     nil)
(def ^:dynamic *end*       nil)
(def ^:dynamic *shrink*    nil)

(hl/defelem toolbar [attr kids]
  (let [fixed     (:fixed     attr *fixed*)
        last-row  (:last-row  attr *last-row*)
        flexible  (:flexible  attr *flexible*)
        waterfall (:waterfall attr *waterfall*)]
    (hl/header
      (core/assoc-class attr
        {:mdc-toolbar                     true
         :mdc-toolbar--fixed              fixed
         :mdc-toolbar--fixed-lastrow-only last-row
         :mdc-toolbar--flexible           flexible
         :mdc-toolbar--waterfall          waterfall})
      kids)))

(hl/defelem row [attr kids]
  (let []
    (hl/div
      (core/assoc-class attr
        {:mdc-toolbar__row true})
      kids)))

(hl/defelem content [attr kids]
  (let [fixed (:fixed attr *fixed*)]
    (hl/main
      (core/assoc-class attr
        {:mdc-toolbar-fixed-adjust fixed})
      kids)))

(hl/defelem section [attr kids]
  (let [start  (:start  attr *start*)
        end    (:end    attr *end*)
        shrink (:shrink attr *shrink*)]
    (hl/section
      (core/assoc-class attr
        {:mdc-toolbar__section                true
         :mdc-toolbar__section--align-start   start
         :mdc-toolbar__section--align-end     end
         :mdc-toolbar__section--shrink-to-fit shrink})
      kids)))

(hl/defelem title [attr kids]
  (let []
    (hl/span
      (core/assoc-class attr
        {:mdc-toolbar__title true})
      kids)))
