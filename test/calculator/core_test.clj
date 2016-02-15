(ns calculator.core-test
  (:use midje.sweet)
  (:require [clojure.test :refer :all]
            [calculator.core :refer :all]))

(facts "Addition"
       (fact "1 + 1 = 2"
             (addition 1 1) => 2)
       (fact "1 + 2 = 3"
             (addition 1 2) => 3)
       )

(facts "subtraction"
       (fact "1 - 2 = -1"
             (subtract 1 2) => -1)
       (fact "2 - 1 = 1"
             (subtract 2 1) => 1)
       (fact "2 - (-1) = 3"
             (subtract 2 -1) => 3)
       )

(facts "multiply"
       (fact "1 * 0 = 0"
             (multiply 1 0) => 0))
