package com.orientechnologies.orient.core.metadata.security.jwt;

/**
 * Created by emrul on 28/09/2014.
 *
 * @author Emrul Islam <emrul@emrul.com> Copyright 2014 Emrul Islam
 */
public interface OJwtHeader {

  String getAlgorithm();

  void setAlgorithm(String alg);

  String getType();

  void setType(String typ);

  String getKeyId();

  void setKeyId(String kid);

}
