SELECT '/home/grep/src/'||a.board_id||'/'||a.file_id||a.file_name||a.file_ext as FILE_PATH
from USED_GOODS_FILE a inner join USED_GOODS_BOARD b
on a.board_id = b.board_id
where b.views = (select max(views) from USED_GOODS_BOARD)
order by FILE_PATH desc