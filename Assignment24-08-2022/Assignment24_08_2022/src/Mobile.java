enum Mobile {
	SAMSUNG(13),LENOVO(12),IPHONE(1);
    int price;
	Mobile(int price) {
    	 this.price=price;
     }
	int printPrice() {
		return price;
	}
	
}
