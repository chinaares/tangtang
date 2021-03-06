package me.zohar.runscore.statisticalanalysis.repo.merchant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import me.zohar.runscore.statisticalanalysis.domain.merchant.MerchantTradeSituation;

public interface MerchantTradeSituationRepo
		extends JpaRepository<MerchantTradeSituation, String>, JpaSpecificationExecutor<MerchantTradeSituation> {

}
