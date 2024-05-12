-- 코드를 입력하세요
SELECT PRODUCT_ID, PRODUCT_NAME, SUM(AMOUNT * PRICE) TOTAL_SALES
FROM FOOD_ORDER LEFT JOIN FOOD_PRODUCT USING (PRODUCT_ID)
WHERE TO_CHAR(PRODUCE_DATE, 'YYYY-MM') = '2022-05'
GROUP BY PRODUCT_ID, PRODUCT_NAME
ORDER BY TOTAL_SALES DESC, PRODUCT_ID;