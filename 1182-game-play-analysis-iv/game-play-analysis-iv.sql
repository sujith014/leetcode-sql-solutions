# Write your MySQL query statement below
SELECT ROUND(
    (
        SELECT COUNT(DISTINCT a.player_id)
        FROM Activity a
        JOIN (
            SELECT player_id, MIN(event_date) AS first_logged_date
            FROM Activity
            GROUP BY player_id
        ) AS first_logged
        ON a.player_id = first_logged.player_id 
        AND a.event_date = DATE_ADD(first_logged.first_logged_date, INTERVAL 1 DAY)
    )/ COUNT(DISTINCT Activity.player_id), 2
) AS fraction
FROM Activity;

