package com.aftership.sdk.model.tracking;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.aftership.sdk.model.checkpoint.Checkpoint;
import lombok.Data;

/** Tracking Object */
@Data
public class Tracking {
  /**
   * Date and time of the tracking created.
   *
   * <p>DateTime
   */
  private Date createdAt;
  /**
   * Date and time of the tracking last updated.
   *
   * <p>DateTime
   */
  private Date updatedAt;
  /**
   * A unique identifier generated by AfterShip for the tracking.
   *
   * <p>String
   */
  private String id;
  /**
   * The postal code of receiver's address. Required by some couriers, such asdeutsch-post
   *
   * <p>String
   */
  private String trackingPostalCode;
  /**
   * Shipping date inYYYYMMDDformat. Required by some couriers, such asdeutsch-post
   *
   * <p>String
   */
  private String trackingShipDate;
  /**
   * Account number of the shipper for a specific courier. Required by some couriers, such
   * asdynamic-logistics
   *
   * <p>String
   */
  private String trackingAccountNumber;
  /**
   * Origin Country of the shipment for a specific courier. Required by some couriers, such asdhl
   *
   * <p>String
   */
  private String trackingOriginCountry;
  /**
   * Destination Country of the shipment for a specific courier. Required by some couriers, such
   * aspostnl-3s
   *
   * <p>String
   */
  private String trackingDestinationCountry;
  /**
   * Located state of the shipment for a specific courier. Required by some couriers, such
   * asstar-track-courier
   *
   * <p>String
   */
  private String trackingState;
  /**
   * Key of the shipment for a specific courier. Required by some couriers, such assic-teliway
   *
   * <p>String>
   */
  private String trackingKey;
  /**
   * Unique code of courier. Get courier slug here
   *
   * <p>String
   */
  private String slug;
  /** Tracking number of a shipment. */
  private String trackingNumber;
  /**
   * Whether or not AfterShip will continue tracking the shipments. Value is false when tag (status)
   * is Delivered, Expired, or further updates for 30 days since last update.
   *
   * <p>Boolean
   */
  private boolean active;
  /**
   * Google cloud message registration IDs to receive the push notifications. Accept either array or
   * comma separated as input.
   *
   * <p><b>Array or String</b>
   */
  private List<String> android;
  /**
   * Custom fields of the tracking.
   *
   * <p><b>Hash</b>
   */
  private Map<String, String> customFields;
  /**
   * Customer name of the tracking.
   *
   * <p>String
   */
  private String customerName;
  /**
   * Total delivery time in days. - Difference of 1st checkpoint time and delivered time for
   * delivered shipments - Difference of 1st checkpoint time and current time for non-delivered
   * shipments Value as 0 for pending shipments or delivered shipment with only one checkpoint.
   *
   * <p>Number
   */
  private int deliveryTime;
  /**
   * Destination country of the tracking. ISO Alpha-3 (three letters). If you use postal service to
   * send international shipments, AfterShip will automatically get tracking results from
   * destination postal service based on destination country.
   *
   * <p>String
   */
  private String destinationCountryIso3;
  /**
   * Destination country of the tracking detected from the courier. ISO Alpha-3 (three letters).
   * Value will be null if the courier doesn't provide the destination country.
   *
   * <p>String
   */
  private String courierDestinationCountryIso3;
  /**
   * Email address(es) to receive email notifications. Comma separated for multiple values.
   *
   * <p>Array
   */
  private List<String> emails;
  /**
   * Expected delivery date (nullable). Available format: YYYY-MM-DD, YYYY-MM-DDTHH:MM:SS, or
   * YYYY-MM-DDTHH:MM:SS+TIMEZONE
   *
   * <p>String
   */
  private String expectedDelivery;
  /**
   * Apple iOS device IDs to receive the push notifications. Accept either array or comma separated
   * as input.
   *
   * <p><b>Array or String</b>
   */
  private List<String> ios;
  /**
   * Text field for order ID
   *
   * <p>order_id
   */
  private String orderId;
  /**
   * Text field for order path
   *
   * <p>String
   */
  private String orderIdPath;
  /**
   * Origin country of the tracking. ISO Alpha-3 (three letters).
   *
   * <p>String
   */
  private String originCountryIso3;
  /**
   * The token to generate the direct tracking link: https://yourusername.aftership.com/unique_token
   * or https://www.aftership.com/unique_token
   *
   * <p>String
   */
  private String uniqueToken;
  /**
   * Number of packages under the tracking (if any).
   *
   * <p>Number
   */
  private int shipmentPackageCount;
  /**
   * Shipment type provided by carrier (if any).
   *
   * <p>String
   */
  private String shipmentType;
  /**
   * Shipment weight provied by carrier (if any)
   *
   * <p>Number
   */
  private int shipmentWeight;
  /**
   * Weight unit provied by carrier, either in kg or lb (if any)
   *
   * <p>String
   */
  private String shipmentWeightUnit;
  /**
   * Date and time the tracking was last updated
   *
   * <p>DateTime
   */
  private Date lastUpdatedAt;
  /**
   * Date and time the tracking was picked up
   *
   * <p>DateTime
   */
  private Date shipmentPickupDate;
  /**
   * Date and time the tracking was delivered
   *
   * <p>DateTime
   */
  private Date shipmentDeliveryDate;
  /**
   * Phone number(s) subscribed to receive sms notifications. Comma separated for multiple values
   *
   * <p>Array
   */
  private List<String> subscribedSmses;
  /**
   * Email address(es) subscribed to receive email notifications. Comma separated for multiple
   * values
   *
   * <p>Array
   */
  private List<String> subscribedEmails;
  /**
   * Signed by information for delivered shipment (if any).
   *
   * <p>String
   */
  private String signedBy;
  /**
   * Phone number(s) to receive sms notifications. The phone number(s) to receive sms notifications.
   * Phone number should begin with `+` and `Area Code` before phone number. Comma separated for
   * multiple values.
   *
   * <p>Array
   */
  private List<String> smses;
  /**
   * Source of how this tracking is added.
   *
   * <p>source
   */
  private String source;
  /**
   * Current status of tracking. Values include Pending InfoReceived InTransit OutForDelivery
   * AttemptFail Delivered AvailableForPickup Exception Expired (See tag definition) @link
   * https://docs.aftership.com/api/4/delivery-status
   *
   * <p>String
   */
  private String tag;
  /**
   * Current subtag of tracking. (See subtag definition)
   *
   * @link https://help.aftership.com/hc/en-us/articles/360007823253
   *     <p>String
   */
  private String subtag;
  /**
   * Normalized tracking message. (See subtag definition)
   *
   * @link https://help.aftership.com/hc/en-us/articles/360007823253
   *     <p>String
   */
  private String subtagMessage;
  /**
   * Title of the tracking.
   *
   * <p>String
   */
  private String title;
  /**
   * Number of attempts AfterShip tracks at courier's system.
   *
   * <p>Number
   */
  private int trackedCount;
  /**
   * Indicates if the shipment is trackable till the final destination. Three possible values: true
   * false null
   *
   * <p>Boolean or Null
   */
  private Boolean lastMileTrackingSupported;
  /**
   * Store, customer, or order language of the tracking. ISO 639-1 Language Code .
   *
   * @link https://help.aftership.com/hc/en-us/articles/360001623287-Supported-Language-Parameters
   *     <p>String or Null
   */
  private String language;
  /**
   * Whether or not the shipment is returned to sender. Value is true when any of its checkpoints
   * has subtagException_010(returning to sender) orException_011 (returned to sender). Otherwise
   * value is false
   *
   * <p><font color="red">Boolean</font>
   */
  private Boolean returnToSender;
  /**
   * Promised delivery date of an order inYYYY-MM-DDformat.
   *
   * <p>String
   */
  private String orderPromisedDeliveryDate;
  /**
   * Shipment delivery type pickup_at_store pickup_at_courier door_to_door
   *
   * <p>String
   */
  private String deliveryType;
  /**
   * Shipment pickup location for receiver
   *
   * <p>String
   */
  private String pickupLocation;
  /**
   * Shipment pickup note for receiver
   *
   * <p>String
   */
  private String pickupNote;
  /**
   * Official tracking URL of the courier (if any)
   *
   * <p>String
   */
  private String courierTrackingLink;
  /**
   * Delivery instructions (delivery date or address) can be modified by visiting the link if
   * supported by a carrier.
   */
  private String courierRedirectLink;
  /**
   * date and time of the first attempt by the carrier to deliver the package to the addressee
   * Available format: YYYY-MM-DDTHH:MM:SS, or YYYY-MM-DDTHH:MM:SS+TIMEZONE
   *
   * <p><font color="red">String or Null</font>
   */
  private String firstAttemptedAt;
  /**
   * Array of Hash describes the checkpoint information.
   *
   * <p>Array of Checkpoint Object
   */
  private List<Checkpoint> checkpoints;
}
