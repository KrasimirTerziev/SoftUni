<?php

function search($tree, $number){
    $i = 0;
    $result = false;

    while ($i < count($tree))
    {
        if($tree[$i] == $number){
          echo "$tree[$i] is part of tree ";
          $result = true;
          break;
        }
        $i++;
    }
    if(!$result){
        echo "value is not part of the tree";
    }
}



