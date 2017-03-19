(ns material-hl.boot-material
  (:require [boot.core :as boot]
            [degree9.boot-npm :as npm]))


(boot/deftask material
  "Download material web components npm package."
  [m material        VAL  str  "Version for material web components package."]
   (npm/npm
     :install {:material-components-web (:material *opts* "latest")}
     :cache-key ::material))
