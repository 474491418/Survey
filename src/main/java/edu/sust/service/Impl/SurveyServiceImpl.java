package edu.sust.service.Impl;

import edu.sust.dao.Interface.BaseDao;
import edu.sust.po.Survey;
import edu.sust.service.Interface.SurveyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by envy15 on 2015/4/8 0008.
 */
@Service("surveyService")
public  class SurveyServiceImpl extends  AbstractBaseService<Survey> implements SurveyService{
    @Resource(name = "surveyDao")
    public void setDao(BaseDao<Survey> dao) {
        super.setDao(dao);
    }
}
