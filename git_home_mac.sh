clear

git add .

my_date=$(date)

echo $my_date

git commit -m "Macbook Pro, Checkin Timestamp::$my_date"

git push origin main
