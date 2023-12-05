package com.zee5.AndroidHipiPages;

import org.openqa.selenium.By;

public class HipiECommerce {
	

	public static By objShopTheLookBtn = By.xpath("//*[contains(@text,'Shop the look')]");
	
	public static By objHipiCampImage = By.xpath("//*[@resource-id='com.zee5.hipi:id/camp_image']");
	
	public static By objSalePrice = By.xpath("//*[@resource-id='com.zee5.hipi:id/sale_price']");
	
	public static By objBuyNowHipiCTA = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvBuyNow' and @text='Buy']");
	
	public static By objCloseBtn = By.xpath("//*[@resource-id='com.zee5.hipi:id/close_button']");
	
	public static By objHipiProductPage = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvTitle' and @text='HIPI']");
	
	public static By objHipiProductDescription = By.xpath("(//*[@resource-id='com.zee5.hipi:id/camp_image']/parent::*/parent::*/following-sibling::*)[1]");
	
	public static By objHipiProductWishlistIcon = By.xpath("(//*[@resource-id='com.zee5.hipi:id/camp_image']/parent::*/parent::*/following-sibling::*)[2]");
	
	public static By objHipiProductImage = By.xpath("//*[@resource-id='com.zee5.hipi:id/labels_parent']");
	
	public static By objPaginationDots = By.xpath("//*[@resource-id='com.zee5.hipi:id/tabIndicators']");
	
	public static By objProductImageLabel = By.xpath("//*[@resource-id='com.zee5.hipi:id/labels_parent']");
	
	public static By objHipiPageWishlistIcon  = By.xpath("//*[@resource-id='com.zee5.hipi:id/ivWishlist']");
	
	public static By objProductBrandName = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvTitle']");
	
	public static By objProductDescription = By.xpath("(//*[@resource-id='com.zee5.hipi:id/tvTitle' and @text='HIPI']/following-sibling::*)[1]");
	
	public static By objPriceType  = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvPriceType']");
	
	public static By objActualPrice = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvActualPrice']");
	
	public static By objSellPrice  = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvSellPrice']");
	
	public static By objCartIcon = By.xpath("//*[@resource-id='com.zee5.hipi:id/ivCart']");
	
	public static By objCartPage = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvTitle' and @text='Cart']");
	
	public static By objNoItemInCart  = By.xpath("//*[@resource-id='com.zee5.hipi:id/noDataSubtitle']");
	
	public static By objWishlistPage = By.xpath("//*[@resource-id='com.zee5.hipi:id/textTitle' and @text='Wishlist']");
	
	public static By objAddToCartCTA = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvAddToCart']");
	
	public static By objGoToCartCTA = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvAddToCart' and @text='Go to cart']");
	
	public static By objCartCount = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvCartCount']");
	
	public static By objToastMsg = By.xpath("//android.widget.Toast[1]");
	
	public static By objProductRemoveCloseBtn = By.xpath("//*[@resource-id='com.zee5.hipi:id/ivRemove']");
	
	public static By objRemoveCTA = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvOk']");
	
	public static By differentSizes(int index) {
		return By.xpath("(//*[@resource-id='com.zee5.hipi:id/tvName'])["+index+"]");
	}
	
	public static By objRemoveItemHeader = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvTitle' and @text='Remove this item from the cart']");
	
	public static By objRemoveItemPromptMsg = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvMessage' and @text='Are you sure you want to remove this item from the cart?']");
	
	public static By objCancelCTA = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvCancel']");
	
	public static By objProductThumbnailCartPage = By.xpath("//*[@resource-id='com.zee5.hipi:id/ivProduct']");
	
	public static By objProdCountDecrease = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvDecrease']");
	
	public static By objProdCountIncrease  = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvIncrease']");
	
	public static By objSelectedSizeVal = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvSizeValue']");
	
	public static By objSelectedColorVal = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvColorValue']");
	
	public static By objMoveToWishlistLink = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvMoveWishlist']");
	
	public static By objMRPVal = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvTotalMRPValue']");
	
	public static By objDiscountVal = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvDiscountValue']");
	
	public static By objTotalAmtVal = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvTotalAmount']");
	
	public static By objProdQuantity = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvQuantity']");
	
	public static By objMoveToWishlistTxt = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvTitle' and contains(@text,'Move this')]");
	
	public static By objMoveToWishlistCTA  = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvOk']");
	
	public static By objProceedToBuy = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvContinue']");
	
	public static By objAddressPage = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvTitle' and contains(@text,'ddress')]");
	
	public static By objShippingAddressDetails = By.xpath("//*[@text='Enter shipping address details']");
	
	public static By objNameField = By.xpath("//*[@resource-id='com.zee5.hipi:id/etName']");
	
	public static By objPhoneField = By.xpath("//*[@resource-id='com.zee5.hipi:id/etPhone']");
	
	public static By objPinCodeField = By.xpath("//*[@resource-id='com.zee5.hipi:id/etPincode']");
	
	public static By objCityField = By.xpath("//*[@resource-id='com.zee5.hipi:id/etCity']");
	
	public static By objStateField = By.xpath("//*[@resource-id='com.zee5.hipi:id/etState']");
	
	public static By objHouseField = By.xpath("//*[@resource-id='com.zee5.hipi:id/etHouse']");
	
	public static By objAreaField = By.xpath("//*[@resource-id='com.zee5.hipi:id/etArea']");
	
	public static By objLandmarkField = By.xpath("//*[@resource-id='com.zee5.hipi:id/etLandmark']");
	
	public static By objErrorMsg = By.xpath("//*[@class='android.widget.TextView' and contains(@text,'Please')]");
	
	public static By objShareIcon = By.xpath("//*[@resource-id='com.zee5.hipi:id/ivShare']");
	
	public static By objAvailableColorsHeader = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvColor' and @text='Available colors']");
	
	public static By objColorNames = By.xpath("(//*[@resource-id='com.zee5.hipi:id/colorView']/following-sibling::*)[2]");
	
	public static By objSelectedColor = By.xpath("(//*[@resource-id='com.zee5.hipi:id/selectedView'])[1]");
	
	public static By objSizeHeader = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvSize']");
	
	public static By objdiffSizes = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvName' and (contains(@text,'S') or contains(@text,'Free') or contains(@text,'M') or contains(@text,'L')  or contains(@text,'XL')or contains(@text,'XXL'))] ");
	
	public static By objQuanityHeader = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvQuantityTitle']");
	
	public static By objQuantity = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvQuantity']");
	
	public static By objPinCodeTitle = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvPinTitle']");
	
	public static By objPinCodeTextField = By.xpath("//*[@resource-id='com.zee5.hipi:id/etPincode']");
	
	public static By objSubmitCTANonHighlighted = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvPinSubmit' and @enabled='false']");
	
	public static By objSubmitCTAHighlighted = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvPinSubmit' and @enabled='true']");
	
	public static By objDeliverTo = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvDeliverTo']");
	
	public static By objPinCodeEntered = By.xpath("(//*[@resource-id='com.zee5.hipi:id/tvDeliverTo']/following-sibling::*)[1]");
	
	public static By objPinChange = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvPinChange']");
	
	public static By objBuyNowCTA = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvBuyNow']");
	
	public static By objProdDetailsHeader = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvMetafieldTitle' and @text='Product Details']");
	
	public static By objProdTypeSubHeader = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvTitle' and @text='Type']");
	
	public static By objProdType = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvTitle' and @text='Type']/following-sibling::*");
	
	public static By objFabricCareSubHeader = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvTitle' and @text='Fabric Care']");
	
	public static By objFabricCareType = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvTitle' and @text='Fabric Care']/following-sibling::*");
	
	public static By objPatternSubHeader = By.xpath("//*[@text='Pattern']");
	
	public static By objPatternType = By.xpath("//*[@text='Pattern']/following-sibling::*");
	
	public static By objFabricSubHeader = By.xpath("//*[@text='Fabric']");
	
	public static By objFabricType = By.xpath("//*[@text='Fabric']/following-sibling::*");
	
	public static By objOccasionSubHeader = By.xpath("//*[@text='Occasion']");
	
	public static By objOccasionType = By.xpath("//*[@text='Occasion']/following-sibling::*");
	
	public static By objDescriptionHeader = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvDespTitle']");
	
	public static By objDescriptionDetails = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvDescription']");
	
	public static By objShippingIndia = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvShipping']");
	
	public static By objEasyReturn = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvFreeReturn']");
	
	public static By objDeliverHere = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvContinue' and @text='Deliver here']");
	
	public static By objRazporPayPage = By.xpath("//*[contains(@text,'Razorpay')]");
	
	public static By objHipiLogo = By.xpath("//*[@resource-id='logo']");
	
	public static By objPaymentOptions = By.xpath("//*[@text='Cards, UPI & More']");
	
	public static By objCardOption = By.xpath("//*[@text='Card']");
	
	public static By objUPIOption = By.xpath("//*[@text='UPI ...']");
	
	public static By objNetbankingOption = By.xpath("//*[@text='Netbanking ...']");
	
	public static By objWalletOption = By.xpath("//*[@text='Wallet']");
	
	public static By objPrice = By.xpath("//*[contains(@text,'₹')]");
	
	public static By objPayNowCTA = By.xpath("//*[@class='android.widget.Button' and @text='Pay Now']");
	
	public static By objCardDetailsPage = By.xpath("//*[@text='Add New Card']");
	
	public static By UPIDetailsPage = By.xpath("//*[@text='Pay With UPI ID/ Mobile Number']");
	
	public static By NetbankingPage = By.xpath("//*[@text='Select Bank']");
	
	public static By walletPage = By.xpath("//*[@text='Select Wallet']");
	
	public static By objFailedOrder = By.xpath("//*[@resource-id='com.zee5.hipi:id/tvFailedTitle']");
	
}
