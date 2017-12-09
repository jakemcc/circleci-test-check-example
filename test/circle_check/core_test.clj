(ns circle-check.core-test
  (:require [clojure.test.check :as tc]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [clojure.test :refer :all]))

(defspec double-sort-works
  100
  (prop/for-all [v (gen/vector gen/int)]
                (= (sort v) (sort (sort v)))))
