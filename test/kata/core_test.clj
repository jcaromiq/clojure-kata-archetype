(ns kata.core_test
  (:require
    [kata.core :refer :all]
    [clojure.test :refer [deftest testing is]]
    [greenpowermonitor.test-doubles :as td]))


(deftest stubbing-function-with-predefined-returns
  (td/with-doubles :stubbing [hello-world :returns ["hola" "hello"]]
                   (is (= "hola" (hello-world)))
                   (is (= "hello" (hello-world)))))



(deftest stubbing-function-with-same-return
  (td/with-doubles :stubbing [hello-world :constantly "hola"]
                   (is (= "hola" (hello-world)))
                   (is (= "hola" (hello-world)))
                   (is (= "hola" (hello-world)))))