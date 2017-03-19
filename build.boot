(defn get-deps    []     (-> "./dependencies.edn" slurp read-string))
;(defn get-devdeps []     (read-file "./dev_dependencies.edn"))

(set-env!
 :dependencies   (get-deps)
 :resource-paths #{"src"})

(require
 '[adzerk.bootlaces :refer :all]
 '[hoplon.boot-hoplon :refer :all]
 '[degree9.boot-semver :refer :all]
 '[material-hl.boot-material :refer [material]])

(task-options!
 pom    {:project 'degree9/material-hl
         :version (get-version)
         :description "Material Web Components for Hoplon"
         :url "https://github.com/degree9/material-hl"
         :scm {:url "https://github.com/degree9/material-hl"}})

(deftask deploy
  "Build project for deployment to clojars."
  []
  (comp
    (version :minor 'inc :patch 'zero)
    (hoplon  :manifest true)
    (build-jar)
    (push-release)))

(deftask develop
  "Build project for development."
  []
  (comp
    (watch)
    (version :no-update true
             :minor 'inc
             :patch 'zero
             :pre-release 'snapshot)
    (hoplon :manifest true)
    (build-jar)))
