package com.mark.bus.data;

public class DataHandler1 {

	public static DataFromWholeController1 dw1 = new DataFromWholeController1();
	public static DataFromWholeController2 dw2 = new DataFromWholeController2();
	public static DataFromWholeController3 dw3 = new DataFromWholeController3();
	public static DataFromWholeController5 dw5 = new DataFromWholeController5();
	public static DataFromWholeController7 dw7 = new DataFromWholeController7();
	public static DataFromWholeController8 dw8 = new DataFromWholeController8();
	public static DataFromWholeController9 dw9 = new DataFromWholeController9();

	public static DataFromBMS1 db1 = new DataFromBMS1();
	public static DataFromBMS2 db2 = new DataFromBMS2();
	public static DataFromBMS3 db3 = new DataFromBMS3();
	public static DataFromBMS4 db4 = new DataFromBMS4();

	public static DataFromInsulation di = new DataFromInsulation();

	public static DataFromInstrument1 din1 = new DataFromInstrument1();
	public static DataFromInstrument2 din2 = new DataFromInstrument2();

	public static DataFromEM1 de1 = new DataFromEM1();
	public static DataFromEM2 de2 = new DataFromEM2();
	public static DataFromEM3 de3 = new DataFromEM3();

	public static DataFromIntegrationCabin dic = new DataFromIntegrationCabin();

	public static DataFromAC da = new DataFromAC();

	public static DataFromFireAlarmSensor dfa = new DataFromFireAlarmSensor();

	public static DataFromBusCanModule dbcm = new DataFromBusCanModule();

	public static void testd() {
		System.out.println("this is form c through jni");
	}

	public static void setDBCM(int[] i) {
		dbcm.zhizongdianyuanjidianqi = i[0];
		dbcm.weishangjiandeng = i[1];
		dbcm.houcangmendianchiganyingshixianweikaiguan = i[2];
		dbcm.weishengjianqiangzhipaiwu = i[3];
		dbcm.qidongjidianqi = i[4];
		dbcm.daochedeng = i[5];
		dbcm.zhidongdeng = i[6];
		dbcm.houwudeng = i[7];
		dbcm.xinglijiadeng = i[8];
		dbcm.dinglandeng = i[9];
		dbcm.zuozhuanxiangdeng = i[10];
		dbcm.youzhuanxiangdeng = i[11];
		dbcm.jiashiyuandingdeng = i[12];
		dbcm.dingshuangbaideng = i[13];
		dbcm.dingdanbaideng = i[14];
		dbcm.yuedudeng = i[15];
		dbcm.zhongmenkaimendiancifa = i[16];
		dbcm.zhongmenguanmendiancifa = i[17];
		dbcm.dianshijidianyuan = i[18];
		dbcm.weishengjianyourenzhishideng = i[19];
		dbcm.zhongmentabudeng = i[20];
		dbcm.youxinglicangzhaomingdeng = i[21];
		dbcm.yuguaqimandang = i[23];
		dbcm.shigaodeng = i[24];
		dbcm.labazhuanhuankaiguan = i[25];
		dbcm.kongtiaokaiguandianyuan = i[26];
		dbcm.yuguaqikuaidang = i[27];
		dbcm.youqianzhuanxiang = i[28];
		dbcm.zuoqianzhuanxiang = i[29];
		dbcm.penshuidianji = i[30];
		dbcm.guanmendiancifa = i[31];
		dbcm.kaimendiancifa = i[32];
		dbcm.jinguangdeng = i[33];
		dbcm.qianwudeng = i[34];
		dbcm.yuanguangdeng = i[35];
		dbcm.qianmentabudeng = i[36];
	}

	public static void setDFA(int i1, int i2, int i3, int i4, int i5) {
		dfa.yanwubaojingqizhuangtai = i1;
		dfa.sci = i2;
		dfa.sbi = i3;
		dfa.sai = i4;
		dfa.lifexinhao = i5;

	}

	public static void setDAC(int i1, int i2, int i3, int i4, int i5, float f1,
			float f2) {
		da.guzhangdaima = i1;
		da.dangqianfengsudangwei = i2;

		da.kongtiaosongfengmoshi = i3;
		da.kongtiaogongzuomoshi = i4;
		da.kongtiaogongzuozhuangtai = i5;

		da.cheneishijiwendu = f1;
		da.kongtiaoshijishuchugonglv = f2;
	}

	public static void setDIC(int[] i, float f1) {
		dic.zongdianyuanjiechuqishuchuzhuangtai = i[0];
		dic.kongtiaojidianqishuchuzhuangtai = i[1];
		dic.chushuangjidianqishuchuzhuangtai = i[2];
		dic.gaoyazhishidengshuchuzhuangtai = i[3];
		dic.zhujiechuqishuchuzhuangtai = i[4];
		dic.yuchongdianjiechuqishuchuzhuangtai = i[5];
		dic.zongdianyuanyuchongdianjiechuqishuchuzhuangtai = i[6];
		dic.chongdianjidianqishuchuzhuangtai = i[7];
		dic.zongdianyuanjiechuqifankuizhuangtai = i[8];
		dic.kongtiaojidianqifankuizhuangtai = i[9];
		dic.chushuangjidianqifankuizhuangtai = i[10];
		dic.gaoyazhishidengfankuizhuangtai = i[11];
		dic.zhujiechuqifankuizhuangtai = i[12];
		dic.yuchongdianjiechuqifankuizhuangtai = i[13];
		dic.zongdianyuanyujiechuqifankuizhuangtai = i[14];
		dic.chongdianjidianqifankuizhuangtai = i[15];
		dic.canlifexinhao = i[16];

		dic.zongdianliu = f1;

	}

	public static void setDEM3(float f1, float f2, float f3, float f4) {
		de3.diandongjizuidaqudonggonglv = f1;
		de3.diandongjizuidazhidonggonglv = f2;
		de3.diandongjizuidadiandongzhuanju = f3;
		de3.diandongjizuidazhidongzhuanju = f4;
	}

	public static void setDEM2(int[] i) {
		de2.kongzhiqiwendu = i[0];
		de2.diandongjiwendu = i[1];
		de2.diandongjizhuansu = i[2];
		de2.dianjikongzhiqiguore = i[3];
		de2.dianjikongzhiqiqianya = i[4];
		de2.dianjichaosu = i[5];
		de2.dianjikongzhiqiguozai = i[6];
		de2.kaiguanluojijiancha = i[7];
		de2.jiaoshabaojing = i[8];
		de2.jiechuqiqudianguzhang = i[9];
		de2.shangdiankongdangjianchaguzhang = i[10];
		de2.zhiliuceguoya = i[11];
		de2.igbtguzhang = i[12];
		de2.dianjikongzhiqiguoliu = i[13];
		de2.kongzhidianluqianya = i[14];
		de2.dianjikongzhiqiguoya = i[15];
		de2.gaotabanguzhang = i[16];
		de2.shoushabaojing = i[17];
		de2.readyxinhao = i[18];
	}

	public static void setDEM1(int i1, int i2, int i3, int i4, int i5, int i6,
			int i7, int i8, int i9) {
		de1.zhujiechuqizhuangtai = i1;
		de1.diandongfadian = i2;
		de1.qitakongzhuan = i3;
		de1.zhuanjuzhuansumoshi = i4;
		de1.zhengzhuanfanzhuan = i5;
		de1.zhengchangguzhang = i6;
		de1.diandongjixiangdianliu = i7;
		de1.diandongkongzhiqizhiliucedianya = i8;
		de1.diandongjidangqianzhuanju = i9;
	}

	public static void setDIN2(int i1) {
		din2.xiaojilichengqingchubiaozhiwei = i1;
	}

	public static void setDIN1(int i1, int i2, int i3, int i4) {
		din1.daoche = i1;
		din1.qianmen = i2;
		din1.zhongmen = i3;
		din1.houmen = i4;
	}

	public static void setDI(int i1, int i2, int i3, int i4) {
		di.jueyuanjianceyizhuangtai = i1;
		di.jueyuanjinggao = i2;
		di.jueyuandianzuzhi = i3;
		di.lifexinhao = i4;
	}

	public static void setBMS4(float f1, float f2) {
		db4.dianchikechongdiandianliu = f1;
		db4.dianchikefangdiandianliu = f2;
	}

	public static void setBMS3(int i1, int i2, int i3, int i4, int i5, int i6,
			float f1) {
		db3.zuididianyadianchixiangshu = i1;
		db3.zuigaodianyadianchixiangshu = i2;
		db3.zuididianyadianchiweizhi = i3;
		db3.zuigaodianyadianchiweizhi = i4;
		db3.zuidiwendudianchiweizhi = i5;
		db3.zuigaowendudianchiweizhi = i6;
		db3.shengyunengliang = f1;
	}

	public static void setBMS2(int i1, int i2, int i3, int i4, int i5, int i6,
			int i7, int i8, int i9) {
		db2.dianchimokuaizuididianya = i1;
		db2.dianchimokuaizuigaodianya = i2;

		db2.dianchimokuaizuigaowendu = i3;
		db2.dianchimokuaiwendujicha = i4;

		db2.bmsneibutongxunguzhang = i5;
		db2.jiduwenduguogaoguzhang = i6;
		db2.wendujunhengguzhang = i7;
		db2.dianyabujunhengguzhang = i8;
		db2.dianchizongxiangshu = i9;
	}

	public static void setBMS1(float f1, float f2, float f3, int i1, int i2,
			int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
		db1.dianchixitongshishizongdianya = f1;
		db1.dianchishishidianliu = f2;
		db1.dianchisoc = f3;
		db1.mokuaidianyaguogao = i1;
		db1.mokuaidianyaguodi = i2;
		db1.socgao = i3;
		db1.socdi = i4;
		db1.guoliu = i5;
		db1.wenduguogaotingche = i6;
		db1.socguoditingche = i7;
		db1.bupipei = i8;
		db1.chongdianzhuanglianjiebiaozhiwei = i9;
		db1.shifoujinzhichongdianbiaozhiwei = i10;
	}

	public static void setDw9(int[] i) {
		dw9.chongdianjidianqi = i[0];
		dw9.daqibeng = i[1];
		dw9.shuibeng = i[2];
		dw9.fengshan2 = i[3];
		dw9.fengshan1 = i[4];
		dw9.kongtiaogongzuoxinhao = i[5];
		dw9.gaoyazongzhengyibihe = i[6];
		dw9.gaoyazongzhengyibihemingling = i[7];
		dw9.yuchongdianyibihe = i[8];
		dw9.yuchongdianbihemingling = i[9];
		dw9.keystartxinhao = i[10];
		dw9.shoudaoqiaobankaiguanbihexinhao = i[11];
		dw9.keyonxinhao = i[12];
		dw9.shengyuchongdianshijian = i[13];
	}

	public static void setDw8(float f1, int i1, float f2) {
		dw8.bencixingshilicheng = f1;
		dw8.zonglicheng = i1;
		dw8.kexingshilicheng = f2;
	}

	public static void setDw7(int i1, int i2, int i3, int i4, int i5, int i6,
			int i7) {
		dw7.chongdianjiechuqibiheqingqiuxinhao = i1;
		dw7.chushuangjidianqibiheqingqiuxinhao = i2;
		dw7.kongtiaojidianqibiheqingqiuxinhao = i3;
		dw7.zhujiechuqibiheqingqiuxinhao = i4;
		dw7.yuchongdianjiechuqibiheqingqiuxinhao = i5;
		dw7.zongdianyuanjiechuqibiheqingqiuxinhao = i6;
		dw7.zongdianyuanyuchongdianjiechuqibiheqingqiuxinhao = i7;
	}

	public static void setDw5(int i1, float f1, int i2, int i3, float f2, int i4) {
		dw5.fengsudangwei = i1;
		dw5.shedingwendu = f1;
		dw5.kongtiaosongfengmoshi = i2;
		dw5.kongtiaogongzuomoshi = i3;
		dw5.kongtiaogonglv = f2;
		dw5.kongtiaogongzuoshineng = i4;
	}

	public static void setDw3(int i1, float f2, float f3, float f4) {

		dw3.zishangcichongdianzongdianhao = i1;
		dw3.zhengcheqiya = f2;
		dw3.shunshidianhao = f3;
		dw3.shishichesu = f4;
	}

	public static void setDw2(int i1, int i2, int i3, float f1, float f2) {
		dw2.jinggaodengzhishixinhao = i1;
		dw2.guzhangzhishixinhao = i2;
		dw2.zhengchexitongzhengchangzhishixinhao = i3;
		dw2.zhidongmonixihao = f1;
		dw2.youmenmonixihao = f2;
	}

	public static void setDw1(int[] i, float f1, float f2) {

		dw1.gaoyaqiaobanbihexinhao = i[0];
		dw1.yaoshistxinhao = i[1];
		dw1.yaoshionxinhao = i[2];
		dw1.yaoshiaccxinhao = i[3];
		dw1.zhuanjufangxiang = i[4];
		dw1.zhuanjumoshi = i[5];
		dw1.zhujiechuqizhuangtai = i[6];
		dw1.dianchixiangwenduguodi = i[7];
		dw1.dianchixiangwenduguogao = i[8];
		dw1.dianchichongdiandianliuguoda = i[9];
		dw1.dianchifangdiandianliuguoda = i[10];
		dw1.dianchidantidianyaguodi = i[11];
		dw1.dianchidantidianyaguogao = i[12];
		dw1.dianchizongdianyaguodi = i[13];
		dw1.dianchizongdianyaguogao = i[14];
		dw1.dianjizhidongyouxianxinhao = i[15];
		dw1.yisukaiguan = i[16];
		dw1.zhidongkaiguan = i[17];
		dw1.kongdangkaiguan = i[18];
		dw1.qianjindangkaiguan = i[19];
		dw1.daodangxinhao = i[20];
		dw1.zhuchexinhao = i[21];
		dw1.qiyachuanganqibaojing = i[22];
		dw1.biaozhuncanshushangdianjiaoyanguzhang = i[23];
		dw1.shuibengkongzhixinhao = i[24];
		dw1.shuiweidixinhao = i[25];
		dw1.kongtiaoqidongxinhao = i[26];
		dw1.dianzhidongyouxiaoxinhao = i[27];
		dw1.zhengcheqiya = f1;
		dw1.dianjiniuju = f2;
	}

}
