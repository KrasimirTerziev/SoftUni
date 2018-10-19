<form>
    <textarea cols="50" name="input"></textarea><br/><br/>
    <input type="submit" name="Color text">
</form>


<?php
if (isset($_GET['input'])) {
    $text = $_GET['input'];

    for ($i = 0; $i < strlen($text); $i++) {
        if ($text[$i] != " ") {
            $currElement = ord($text[$i]);
            $result = "";
            if ($currElement % 2 == 0) {
                $result .= "<span style='color: red'>$text[$i] </span>";
            } else {
                $result .= "<span style='color: blue'>$text[$i]</span>";
            }
            echo $result;
        }
    }
}
?>