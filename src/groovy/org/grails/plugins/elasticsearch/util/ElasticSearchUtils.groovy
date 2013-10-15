package org.grails.plugins.elasticsearch.util

import grails.util.Holders

class ElasticSearchUtils {
  public static indexDomain(entity){
    def elasticSearchService = Holders.getGrailsApplication().mainContext.getBean('elasticSearchService')
    elasticSearchService.indexDomain(entity)
  }

  public static deleteDomain(entity){
    def elasticSearchService = Holders.getGrailsApplication().mainContext.getBean('elasticSearchService')
    elasticSearchService.deleteDomain(entity)
  }
}
