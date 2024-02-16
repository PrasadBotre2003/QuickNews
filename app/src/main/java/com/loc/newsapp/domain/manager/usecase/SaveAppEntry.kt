package com.loc.newsapp.domain.manager.usecase

import com.loc.newsapp.domain.manager.LocalUserManager

class SaveAppEntry (    private val  localUserManager : LocalUserManager){


suspend operator fun invoke(){
  return   localUserManager.saveAppEntry()
}


}