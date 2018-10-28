(ns kata.core_should
  (:require [midje.sweet :refer :all]
            [kata.core :refer :all]
            [clojure.test :refer [deftest testing is]]
            [greenpowermonitor.test-doubles :as td]))

(facts
  "about Kata"
  (fact
    "print hello world"
    (hello-world) => "Hello world"
    (hello "Pepe") => "Hello Pepe")
  (fact
    "test doubles"
    (td/with-doubles :stubbing [rand :returns [1 2 3 4]]
                     (is (= 1 (rand)))
                     (is (= 2 (rand)))
                     (is (= 3 (rand)))
                     (is (= 4 (rand)))
                     ;(is (= 4 (rand)))
                     (is (thrown? Exception(rand))))))
