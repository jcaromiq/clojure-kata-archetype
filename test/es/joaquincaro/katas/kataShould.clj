(ns es.joaquincaro.katas.kataShould
    (:require [midje.sweet :refer :all]
      [es.joaquincaro.katas.kata :refer :all]))

(facts
  "about Kata"
  (fact
    "print hello world"
    (hello-world) => "Hello world"

  )
  
)