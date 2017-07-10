(ns material-hl.drawer
  (:require [hoplon.core :as hl]
            [material-hl.core :as core]))

(hl/defelem permanent [attr kids]
  (let []
    (hl/nav
      (core/assoc-class attr
        {:mdc-permanent-drawer true})
      kids)))

(hl/defelem permanent-toolbar-spacer [attr kids]
  (let []
    (hl/div
      (core/assoc-class attr
        {:mdc-permanent-drawer__toolbar-spacer true})
      kids)))

(hl/defelem permanent-content [attr kids]
  (let []
    (hl/div
      (core/assoc-class attr
        {:mdc-permanent-drawer__content true})
      kids)))

(hl/defelem persistent [attr kids]
  (let []
    (hl/aside
      (core/assoc-class attr
        {:mdc-persistent-drawer true})
      kids)))

(hl/defelem persistent-drawer [attr kids]
  (let []
    (hl/nav
      (core/assoc-class attr
        {:mdc-persistent-drawer__drawer true})
      kids)))

(hl/defelem persistent-content [attr kids]
  (let []
    (hl/div
      (core/assoc-class attr
        {:mdc-temporary-drawer__content true})
      kids)))

(hl/defelem persistent-toolbar-spacer [attr kids]
  (let []
    (hl/div
      (core/assoc-class attr
        {:mdc-persistent-drawer__toolbar-spacer true})
      kids)))

(hl/defelem persistent-header [attr kids]
  (let []
    (hl/header
      (core/assoc-class attr
        {:mdc-persistent-drawer__header true})
      kids)))

(hl/defelem persistent-header-content [attr kids]
  (let []
    (hl/header
      (core/assoc-class attr
        {:mdc-persistent-drawer__header-content true})
      kids)))

(hl/defelem temporary [attr kids]
  (let []
    (hl/aside
      (core/assoc-class attr
        {:mdc-temporary-drawer true})
      kids)))

(hl/defelem temporary-drawer [attr kids]
  (let []
    (hl/nav
      (core/assoc-class attr
        {:mdc-temporary-drawer__drawer true})
      kids)))

(hl/defelem temporary-content [attr kids]
  (let []
    (hl/div
      (core/assoc-class attr
        {:mdc-temporary-drawer__content true
         :mdc-list-group                true})
      kids)))

(hl/defelem temporary-toolbar-spacer [attr kids]
  (let []
    (hl/div
      (core/assoc-class attr
        {:mdc-temporary-drawer__toolbar-spacer true})
      kids)))

(hl/defelem temporary-header [attr kids]
  (let []
    (hl/header
      (core/assoc-class attr
        {:mdc-temporary-drawer__header true})
      kids)))

(hl/defelem temporary-header-content [attr kids]
  (let []
    (hl/header
      (core/assoc-class attr
        {:mdc-temporary-drawer__header-content true})
      kids)))
