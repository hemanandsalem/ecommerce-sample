INSERT INTO user_account (username, password, address, mobile_number, email) VALUES
  ('user1', 'root', 'salem','9875643210', 'sample@gmail.com'),
  ('user2', 'root', 'chennai','0123456789', 'sample2@gmail.com');
  
INSERT INTO product (product_id, product_name, price, stock) VALUES 
	('P202','IPhone',200.50,5),
	('P203','Samsung',100.50,15);
	
INSERT INTO order_details(order_id,user_name,product_id, product_name, product_price, quantity, shipping_address) VALUES
	(101,'user1','P201','Iphone',200,5,'Bangalore'),
	(102,'user2','P202','Samsung',140,2,'Chennai'),
	(103,'user1','P203','Nokia',220.50,1,'Salem');