package com.demo.hotelBooking.enumFiles;

import java.util.Arrays;
import java.util.List;
import com.demo.hotelBooking.enumFiles.paymentSubMethods;

public enum paymentMethods {
    CARD_PAYMENTS(
            paymentSubMethods.CREDIT_CARD,
            paymentSubMethods.DEBIT_CARD
    ),
    ONLINE_PAYMENTS(
            paymentSubMethods.PAYPAL,
            paymentSubMethods.GOOGLE_PAY,
            paymentSubMethods.APPLE_PAY,
            paymentSubMethods.AMAZON_PAY
    ),
    DIGITAL_WALLETS(
            paymentSubMethods.PAYTM,
            paymentSubMethods.PHONEPE
    ),
    BANK_TRANSFERS(
            paymentSubMethods.BANK_TRANSFER,
            paymentSubMethods.WIRE_TRANSFER
    ),
    OTHER(
            paymentSubMethods.CASH,
            paymentSubMethods.CHEQUE,
            paymentSubMethods.BANK_DRAFT,
            paymentSubMethods.MOBILE_PAY,
            paymentSubMethods.CRYPTO_CURRENCY,
            paymentSubMethods.PREPAID_CARD,
            paymentSubMethods.GIFT_CARD
    );

  

    paymentMethods(paymentSubMethods creditCard, paymentSubMethods debitCard) {
    }


    paymentMethods(paymentSubMethods paypal, paymentSubMethods googlePay, paymentSubMethods applePay, paymentSubMethods amazonPay) {
    }

    paymentMethods(paymentSubMethods cash, paymentSubMethods cheque, paymentSubMethods bankDraft, paymentSubMethods mobilePay, paymentSubMethods cryptoCurrency, paymentSubMethods prepaidCard, paymentSubMethods giftCard) {
    }
}