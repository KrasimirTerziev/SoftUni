<?php

$arr = ['Sofia','20', 'Varna','10', 'Sofia','5'];
$sums = [];

for ($i = 0; $i < count($arr); $i += 2){
    $town = $arr[$i];
    $income = $arr[$i + 1];

    if(!isset($sums[$town])){
        $sums[$town] = 0;
    }
    $sums[$town] += $income;
}
print_r($sums);