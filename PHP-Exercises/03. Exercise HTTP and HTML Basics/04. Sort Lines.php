<?php
   if (isset($_GET['lines'])) {
      $input = array_filter(array_map(trim,explode("\n", $_GET['lines'])));
      sort($input, SORT_STRING);
      $sortedLines = implode("\n", $input);
   }
?>

<form method="get">
    <textarea rows="10" name="lines"><?= $sortedLines ?></textarea><br>
    <input type="submit" value="Sort"/>
</form>
