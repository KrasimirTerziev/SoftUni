<?php
/*
 * Write a program that receives a number and a list of five operators.
 * Perform the operations in sequence by starting with the input number and using
 * the result of every operation as starting point for the next.
 * Print the result of every operation in order.
 * Input comes in two line.
 * On the first line you will receive your starting point and must be parsed to a number.
 * On the second line you will receive 5 commands separated by ", " each one will be
 * the name of operation to be performed.
 */

$number = intval(readline());
$commands = explode(", ", readline());

$calculate = function ($command, $number){
    switch($command){
        case "chop":
            $number /= 2;
            break;
        case "dice":
            $number = sqrt($number);
            break;
        case "spice":
            $number ++;
            break;
        case "bake":
            $number *= 3;
            break;
        case "fillet":
            $number -= $number * 0.2;
            break;
    }
    return $number;
};
foreach ($commands as $command){
    $number = $calculate($command, $number);
    echo $number . PHP_EOL;
}

