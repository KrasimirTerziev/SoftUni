<?php $this->title = 'Create New Post'; ?>
<h1><?=htmlspecialchars($this->title)?></h1>
<div class="new-post">
    <form class="post-form" method="post">
        <li class="post-elements">
            <div>Title:</div>
            <input type="text" name="post_title" />
            <div >Content:</div>
            <textarea rows="10" name="post_content"></textarea>
        </li>
        <div class="button-second"><input class="submit" type="submit" value="Create" />
        <a href="<?=APP_ROOT?>/posts">Cancel</a></div>
    </form>
</div>
