(ns material-hl.menu
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]))

(def ^:dynamic *top-right*    nil)
(def ^:dynamic *top-left*     nil)
(def ^:dynamic *bottom-right* nil)
(def ^:dynamic *bottom-left*  nil)

(defelem menu [attr kids]
  (let [top-right    (:top-right    attr *top-right*)
        top-left     (:top-left     attr *top-left*)
        bottom-right (:bottom-right attr *bottom-right*)
        bottom-left  (:bottom-left  attr *bottom-left*)]
    (hl/div
      (core/assoc-class attr
        {:mdc-simple-menu                         true
         :mdc-simple-menu--open-from-top-right    top-right
         :mdc-simple-menu--open-from-top-left     top-left
         :mdc-simple-menu--open-from-bottom-right bottom-right
         :mdc-simple-menu--open-from-bottom-left  bottom-left})
      kids)))

(defelem menu-items [attr kids]
  (let []
    (hl/ul
      (-> attr
        (assoc :role "menu")
        (core/assoc-class
          {:mdc-list               true
           :mdc-simple-menu__items true}))
      kids)))

(defelem menu-item [attr kids]
  (let []
    (hl/li
      (-> attr
        (assoc :role "menuitem")
        (core/assoc-class
          {:mdc-list-item true}))
      kids)))
