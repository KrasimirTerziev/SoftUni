<?php
/*
 * Write a program that modifies a number until the average value of all of its
 * digits is higher than 5. In order to modify the number, your program should
 * append a 9 to the end of the number, when the average value of all of its digits
 * is higher than 5 the program should stop appending. If the number's average value
 * of all of its digits is already higher than 5, no appending should be done.
 * The input is a single number receive as a string.
 * The output should consist of a single number which should be printed on the console.
 */



/*
$number = array_map("intval", str_split(readline()));

while(true){
    $avg = array_sum($number) / count($number);

    if($avg > 5){
        break;
    }
    $number[] = 9;
}

echo implode("", $number);
*/

$number = array_map("intval", str_split(readline()));

$check = function ($number){
    return array_sum($number) / count($number);
};

while(true){
    $avg = $check($number);

    if($avg > 5){
        break;
    }
    $number[] = 9;
}

echo implode("", $number);