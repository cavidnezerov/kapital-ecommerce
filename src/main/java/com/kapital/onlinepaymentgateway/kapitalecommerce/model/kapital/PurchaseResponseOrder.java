package com.kapital.onlinepaymentgateway.kapitalecommerce.model.kapital;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JacksonXmlRootElement
public class PurchaseResponseOrder {
    @JacksonXmlProperty(localName = "OrderID")
    private String orderID;
    @JacksonXmlProperty(localName = "SessionID")
    private String sessionID;
    @JacksonXmlProperty(localName = "URL")
    private String url;
}
