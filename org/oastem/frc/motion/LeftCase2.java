		
package org.oastem.frc.motion;			
public class LeftCase2 {			
	public static final int kNumPoints =185;		
	// Position (rotations)	Velocity (RPM)	Duration (ms)
	//A: below are coordinates on a left-facing curve used for motion profiling?
	public static double [][]Points = new double[][]{	
		{6.818197762056797E-5,	0.8181837314468157,	10.0},
		{3.4091014485694056E-4,	1.6363690034182359,	10.0},
		{9.545497727597611E-4,	3.6818377674169227,	10.0},
		{0.0020454689452790355,	6.545515035115648,	10.0},
		{0.0037500411131758953,	10.227433007381162,	10.0},
		{0.00620464850945027,	14.727644377646252,	10.0},
		{0.009545686408495836,	20.046227394273384,	10.0},
		{0.013909568222588674,	26.183290884557042,	10.0},
		{0.019432731420082214,	33.13897918496123,	10.0},
		{0.026251644251092113,	40.913476986059365,	10.0},
		{0.03450281325586742,	49.507014028651824,	10.0},
		{0.044322791530897104,	58.919869650178164,	10.0},
		{0.055848187714754,	69.15237710314136,	10.0},
		{0.06921567565448229,	80.2049276383698,	10.0},
		{0.08456200470088251,	92.07797427840138,	10.0},
		{0.10202401057944076,	104.77203527134941,	10.0},
		{0.12173862676178553,	118.28769709406865,	10.0},
		{0.14384289626558572,	132.6256170228012,	10.0},
		{0.16847398379975279,	147.78652520500245,	10.0},
		{0.19576918815246444,	163.77122611626993,	10.0},
		{0.22579770357061998,	180.1710925089333,	10.0},
		{0.2585605833630167,	196.57727875438027,	10.0},
		{0.29405896309596957,	212.9902783977174,	10.0},
		{0.3322940571285061,	229.41056419521937,	10.0},
		{0.3732671548105222,	245.83858609209616,	10.0},
		{0.41697961642934844,	262.2747697129576,	10.0},
		{0.46343286887455826,	278.7195146712586,	10.0},
		{0.5126284010258825,	295.17319290794535,	10.0},
		{0.5645677588762191,	311.63614710202006,	10.0},
		{0.6192525403720314,	328.1086889748734,	10.0},
		{0.6766843900043095,	344.5910977936693,	10.0},
		{0.7368649931327887,	361.0836187708747,	10.0},
		{0.7997960700522466,	377.5864615167472,	10.0},
		{0.8654793698094523,	394.0997985432349,	10.0},
		{0.9339166637533428,	410.6237636633424,	10.0},
		{1.0051097388980734,	427.1584508683842,	10.0},
		{1.0790603910117516,	443.70391268206885,	10.0},
		{1.155770417405447,	460.2601583621736,	10.0},
		{1.2352416097168515,	476.82715386842585,	10.0},
		{1.3174757461598616,	493.40481865806134,	10.0},
		{1.4024745838867148,	509.9930263611197,	10.0},
		{1.4902398509194337,	526.5916021963139,	10.0},
		{1.5807732379543524,	543.2003222095126,	10.0},
		{1.6740763900437605,	559.8189125364474,	10.0},
		{1.770150898040153,	576.4470479783541,	10.0},
		{1.8689982898544226,	593.0843508856203,	10.0},
		{1.9706200216004532,	609.7303904761834,	10.0},
		{2.0750174685744547,	626.384681844011,	10.0},
		{2.1821919160959173,	643.046685128774,	10.0},
		{2.292144550207898,	659.7158046718803,	10.0},
		{2.40480770015934,	675.9788997086554,	10.0},
		{2.520044738700895,	691.4222312493282,	10.0},
		{2.637718772014804,	706.0441998834534,	10.0},
		{2.757692640323198,	719.843209850367,	10.0},
		{2.879828920364555,	732.8176802481416,	10.0},
		{3.0039899302060125,	744.9660590487462,	10.0},
		{3.1300377360117464,	756.2868348344032,	10.0},
		{3.2578341606498555,	766.7785478286523,	10.0},
		{3.387240794259697,	776.4398016590519,	10.0},
		{3.5181190061852146,	785.2692715531052,	10.0},
		{3.650329958741133,	793.2657153355093,	10.0},
		{3.7837346220025756,	800.4279795686564,	10.0},
		{3.9181937899842962,	806.7550078903228,	10.0},
		{4.053568097959864,	812.2458478534041,	10.0},
		{4.1897180402992475,	816.8996540363069,	10.0},
		{4.326503989716421,	820.7156965030364,	10.0},
		{4.463786216236813,	823.6933591223553,	10.0},
		{4.601424907438444,	825.8321472097814,	10.0},
		{4.739280188357092,	827.1316855118906,	10.0},
		{4.8772121418578624,	827.5917210046264,	10.0},
		{5.0151497987388405,	827.6259412858673,	10.0},
		{5.153091164618545,	827.6481952782261,	10.0},
		{5.291034260068907,	827.6585727021721,	10.0},
		{5.428977120604473,	827.6571632133978,	10.0},
		{5.5669177966640495,	827.6440563574574,	10.0},
		{5.7048543535851675,	827.6193415267061,	10.0},
		{5.842784871559596,	827.5831078465686,	10.0},
		{5.980707445591035,	827.5354441886379,	10.0},
		{6.1186201855232625,	827.4764395933687,	10.0},
		{6.2565212158936925,	827.4061822225747,	10.0},
		{6.394408675907425,	827.3247600823961,	10.0},
		{6.532280719361626,	827.2322607252139,	10.0},
		{6.670135514542326,	827.1287710841984,	10.0},
		{6.807971244297888,	827.0143785333684,	10.0},
		{6.945786105787565,	826.8891689380646,	10.0},
		{7.083578310417452,	826.7532277793188,	10.0},
		{7.2213460837946455,	826.6066402631578,	10.0},
		{7.359087665678327,	826.4494913020915,	10.0},
		{7.496801309734526,	826.2818643371905,	10.0},
		{7.634485283483824,	826.1038424957832,	10.0},
		{7.772137868308048,	825.9155089453463,	10.0},
		{7.909757359111915,	825.7169448231999,	10.0},
		{8.047342064363997,	825.5082315124891,	10.0},
		{8.184890305957467,	825.2894495608198,	10.0},
		{8.322400418898782,	825.060677647894,	10.0},
		{8.459870751495782,	824.8219955819977,	10.0},
		{8.597299664872766,	824.5734802619095,	10.0},
		{8.734685533078155,	824.3152092323314,	10.0},
		{8.87202674279531,	824.0472583029241,	10.0},
		{9.00932169324546,	823.769702700901,	10.0},
		{9.146568796040693,	823.4826167714053,	10.0},
		{9.28376647497525,	823.1860736073382,	10.0},
		{9.420913165938106,	822.8801457771362,	10.0},
		{9.55800731666561,	822.5649043650195,	10.0},
		{9.695047386652922,	822.2404199238744,	10.0},
		{9.83203184691883,	821.906761595442,	10.0},
		{9.968959179877137,	821.5639977498424,	10.0},
		{10.105827879142646,	821.2121955930426,	10.0},
		{10.242636449345405,	820.8514212165528,	10.0},
		{10.379383405985571,	820.4817398410129,	10.0},
		{10.51606727519365,	820.1032152484679,	10.0},
		{10.652686593622006,	819.7159105701202,	10.0},
		{10.7892399081763,	819.3198873257875,	10.0},
		{10.925725775906587,	818.9152063817086,	10.0},
		{11.062142763758086,	818.5019271089861,	10.0},
		{11.198489448415394,	818.0801079438484,	10.0},
		{11.334764416095938,	817.6498060832727,	10.0},
		{11.470966262364655,	817.2110776122971,	10.0},
		{11.607093591926036,	816.7639773682833,	10.0},
		{11.743145018462165,	816.3085592167741,	10.0},
		{11.87911916437431,	815.8448754728832,	10.0},
		{12.01501466067989,	815.3729778334749,	10.0},
		{12.150830146695922,	814.8929160961769,	10.0},
		{12.286564269968398,	814.4047396348662,	10.0},
		{12.422215685954594,	813.9084959171807,	10.0},
		{12.557783057926946,	813.4042318341102,	10.0},
		{12.693265056688537,	812.8919925695449,	10.0},
		{12.828660360443537,	812.3718225299924,	10.0},
		{12.963967654536923,	811.8437645603215,	10.0},
		{13.099185631317816,	811.3078606853602,	10.0},
		{13.234312989859351,	810.7641512492064,	10.0},
		{13.369348435880873,	810.2126761291388,	10.0},
		{13.504290681358945,	809.6534728684372,	10.0},
		{13.639138444624635,	809.0865795941345,	10.0},
		{13.773890449769555,	808.5120308695209,	10.0},
		{13.90854542685409,	807.9298625072166,	10.0},
		{14.043102111425483,	807.3401074283472,	10.0},
		{14.17755924439616,	806.7427978240515,	10.0},
		{14.311915572029154,	806.1379657979599,	10.0},
		{14.44616984540692,	805.5256402666101,	10.0},
		{14.580320820482948,	804.9058504561517,	10.0},
		{14.71436725790075,	804.2786245068295,	10.0},
		{14.848307922704475,	803.6439888223247,	10.0},
		{14.982141584102292,	803.0019683869122,	10.0},
		{15.11586701542495,	802.3525879359404,	10.0},
		{15.249482993877082,	801.6958707127926,	10.0},
		{15.38298830035439,	801.0318388638453,	10.0},
		{15.516381719297753,	800.3605136601828,	10.0},
		{15.649662038405946,	799.6819146491625,	10.0},
		{15.782828048554562,	798.9960608917108,	10.0},
		{15.915878543610987,	798.302970338538,	10.0},
		{16.04881232024933,	797.6026598300675,	10.0},
		{16.18162817779189,	796.8951452553531,	10.0},
		{16.314324918081585,	796.1804417381906,	10.0},
		{16.446901345160235,	795.458562471885,	10.0},
		{16.579356265256656,	794.7295205785058,	10.0},
		{16.71168848658213,	793.9933279528741,	10.0},
		{16.84389681921598,	793.2499958031078,	10.0},
		{16.975980075049264,	792.4995349996738,	10.0},
		{17.107937067141904,	791.7419525558422,	10.0},
		{17.239766610271932,	790.9772587801623,	10.0},
		{17.371467520359108,	790.2054605230508,	10.0},
		{17.503038614337925,	789.4265638728956,	10.0},
		{17.634478710267107,	788.6405755750912,	10.0},
		{17.76578662697284,	787.8475002344046,	10.0},
		{17.896961183858682,	787.0473413150462,	10.0},
		{18.028001201253794,	786.2401043706785,	10.0},
		{18.158905499683886,	785.4257905805465,	10.0},
		{18.28967290005059,	784.6044022002263,	10.0},
		{18.420302223587576,	783.7759412219317,	10.0},
		{18.55079229166628,	782.9404084722055,	10.0},
		{18.6811419256947,	782.0978041705379,	10.0},
		{18.81134994702126,	781.2481279593619,	10.0},
		{18.94141517684371,	780.3913789346941,	10.0},
		{19.0713364361233,	779.5275556775358,	10.0},
		{19.201112545684257,	778.6566573657651,	10.0},
		{19.330742325837523,	777.7786809195793,	10.0},
		{19.460224596234266,	776.8936223804636,	10.0},
		{19.58955817668134,	776.0014826824415,	10.0},
		{19.718741885534364,	775.1022531181294,	10.0},
		{19.847774541555722,	774.1959361281478,	10.0},
		{19.97665496196637,	773.2825224638734,	10.0},
		{20.10538196374966,	772.3620106997554,	10.0},
		{20.23395436319354,	771.4343966632794,	10.0},
		{20.36237097584739,	770.4996759231062,	10.0},
		{20.490630616506863,	769.55784395682,	10.0},
		{20.61873209920633,	768.6088961968059,	10.0},
		{20.74667423721925,	767.6528280775019,	10.0},
		{20.874455843066347,	766.6896350825771,	10.0},
		{21.002075728538642,	765.7193128337675,	10.0},
		{21.12953270534494,	764.7418608377873,	10.0},
		{21.256825583391343,	763.7572682784283,	10.0},
		{21.383953173357252,	762.7655397954526,	10.0},
		{21.51091428420733,	761.7666651004587,	10.0},
		{21.637707725039718,	760.7606449943365,	10.0},
		{21.764332304537636,	759.7474769875034,	10.0},
		{21.890786831044117,	758.7271590388972,	10.0},
		{22.017070112653975,	757.6996896591417,	10.0},
		{22.143180957316286,	756.6650679738767,	10.0},
		{22.269118172947838,	755.6232937893176,	10.0},
		{22.39488056773274,	754.5743687094181,	10.0},
		{22.520466950368334,	753.518295813558,	10.0},
		{22.64587612937319,	752.4550740291289,	10.0},
		{22.771106914357475,	751.3847099057285,	10.0},
		{22.896158115807033,	750.3072086973204,	10.0},
		{23.021028544687223,	749.2225732811717,	10.0},
		{23.14571701343827,	748.130812506238,	10.0},
		{23.270222335830123,	747.0319343511467,	10.0},
		{23.394543327352743,	745.9259491356743,	10.0},
		{23.5186788054205,	744.8128684065572,	10.0},
		{23.642627588941952,	743.6927011287296,	10.0},
		{23.766388500327718,	742.5654683146106,	10.0},
		{23.88996036347817,	741.4311789026925,	10.0},
		{24.01334200600707,	740.2898551733927,	10.0},
		{24.136532258762575,	739.1415165330469,	10.0},
		{24.259529956156683,	737.9861843646345,	10.0},
		{24.382333936510953,	736.8238821256211,	10.0},
		{24.50494304241915,	735.6546354491725,	10.0},
		{24.62735612112703,	734.4784722472793,	10.0},
		{24.74957202588821,	733.2954285670897,	10.0},
		{24.871589614151347,	732.105529578806,	10.0},
		{24.99340775028505,	730.9088168022372,	10.0},
		{25.115025305145302,	729.7053291614943,	10.0},
		{25.236441155933417,	728.4951047286879,	10.0},
		{25.3576541878371,	727.2781914220883,	10.0},
		{25.478663293576336,	726.054634435442,	10.0},
		{25.599467374199296,	724.8244837377775,	10.0},
		{25.720065340630264,	723.587798585787,	10.0},
		{25.84045611221854,	722.3446295296826,	10.0},
		{25.96063861927956,	721.0950423661199,	10.0},
		{26.080611802819735,	719.839101241015,	10.0},
		{26.20037461516607,	718.5768740780372,	10.0},
		{26.319926020617597,	717.3084327091383,	10.0},
		{26.439264996118208,	716.0338530036711,	10.0},
		{26.558390532457494,	714.7532180357199,	10.0},
		{26.6773016342286,	713.4666106266171,	10.0},
		{26.795997321459517,	712.1741233854899,	10.0},
		{26.91447662914928,	710.8758461386085,	10.0},
		{27.032738609152293,	709.5718800180405,	10.0},
		{27.150782330478993,	708.2623279602415,	10.0},
		{27.268606880700563,	706.9473013294032,	10.0},
		{27.38621136545751,	705.6269085416677,	10.0},
		{27.503594911026873,	704.3012734161616,	10.0},
		{27.620756663809548,	702.9705166960472,	10.0},
		{27.737695792313637,	701.6347710245659,	10.0},
		{27.854411487521723,	700.2941712484927,	10.0},
		{27.97090296385658,	698.9488580091408,	10.0},
		{28.08716946017006,	697.5989778808904,	10.0},
		{28.203210241304276,	696.244686805312,	10.0},
		{28.31902459814895,	694.8861410680234,	10.0},
		{28.434611849966487,	693.5235109052333,	10.0},
		{28.549971343920227,	692.1569637224236,	10.0},
		{28.665102457420627,	690.7866810024195,	10.0},
		{28.78000459869464,	689.4128476440621,	10.0},
		{28.894677208550135,	688.0356591329842,	10.0},
		{29.00911975998761,	686.6553086248157,	10.0},
		{29.12333176147571,	685.2720089286427,	10.0},
		{29.23731275626861,	683.8859687573978,	10.0},
		{29.351062324940216,	682.4974120296228,	10.0},
		{29.464580085993354,	681.1065663188198,	10.0},
		{29.577865697110557,	679.7136667032216,	10.0},
		{29.690918856421344,	678.3189558647146,	10.0},
		{29.80373930465025,	676.9226893734564,	10.0},
		{29.916326824379006,	675.5251183725329,	10.0},
		{30.028681243623954,	674.126515469686,	10.0},
		{30.140802435909432,	672.7271537128431,	10.0},
		{30.252690321504492,	671.3273135703807,	10.0},
		{30.364344869623164,	669.92728871205,	10.0},
		{30.475766098604897,	668.5273738904147,	10.0},
		{30.58695407807323,	667.1278768099907,	10.0},
		{30.697908930599738,	665.7291151590706,	10.0},
		{30.8086308318827,	664.3314076977658,	10.0},
		{30.919120013029104,	662.93508687845,	10.0},
		{31.0293767617169,	661.5404921268129,	10.0},
		{31.139401423398553,	660.1479700899183,	10.0},
		{31.249194402658915,	658.7578755621739,	10.0},
		{31.35875616520321,	657.3705752657697,	10.0},
		{31.468087237503376,	655.986433800993,	10.0},
		{31.577188210590595,	654.6058385233139,	10.0},
		{31.68605973888976,	653.2291697949673,	10.0},
		{31.794702543205712,	651.8568258957467,	10.0},
		{31.903117411375142,	650.4892090165522,	10.0},
		{32.011305199534995,	649.1267289591134,	10.0},
		{32.119266833457054,	647.7698035323773,	10.0},
		{32.22700330998994,	646.418859197298,	10.0},
		{32.334515697257615,	645.0743236060671,	10.0},
		{32.44180513749854,	643.7366414455606,	10.0},
		{32.54887284643839,	642.4062536390825,	10.0},
		{32.65572011550549,	641.0836144025913,	10.0},
		{32.76234831255526,	639.7691822986435,	10.0},
		{32.8687588828199,	638.4634215878323,	10.0},
		{32.9749533498791,	637.1668023552171,	10.0},
		{33.08093331658355,	635.8798002266778,	10.0},
		{33.1867004663206,	634.6028984223523,	10.0},
		{33.292256562755995,	633.3365786123297,	10.0},
		{33.39760345198552,	632.0813353771694,	10.0},
		{33.50274306197384,	630.8376599299236,	10.0},
		{33.60767740419754,	629.6060533421992,	10.0},
		{33.71240857359059,	628.3870163583102,	10.0},
		{33.81693874913972,	627.1810532948249,	10.0},
		{33.92127019451262,	625.9886722373946,	10.0},
		{34.025405258295855,	624.8103826993753,	10.0},
		{34.129346374283685,	623.6466959269826,	10.0},
		{34.23309606179303,	622.4981250561048,	10.0},
		{34.33665692556024,	621.3651826032553,	10.0},
		{34.44003165587203,	620.2483818707763,	10.0},
		{34.54322302873717,	619.148237190759,	10.0},
		{34.64623390548062,	618.0652604607479,	10.0},
		{34.749067232566816,	616.9999625171257,	10.0},
		{34.85172604145958,	615.9528533566013,	10.0},
		{34.95421344798734,	614.9244391665727,	10.0},
		{35.056532651924385,	613.9152236222973,	10.0},
		{35.15868693658861,	612.925707985299,	10.0},
		{35.260679667699264,	611.9563866639766,	10.0},
		{35.362514292974836,	611.0077516534349,	10.0},
		{35.46419434110466,	610.080288778941,	10.0},
		{35.565723420706206,	609.1744776092903,	10.0},
		{35.66710521921911,	608.290791077429,	10.0},
		{35.7683435017639,	607.4296952687349,	10.0},
		{35.86944210979867,	606.5916482085908,	10.0},
		{35.970404959709434,	605.7770994646093,	10.0},
		{36.07123604128936,	604.9864894795478,	10.0},
		{36.171939416142635,	604.220249119678,	10.0},
		{36.272519215971016,	603.4787989702759,	10.0},
		{36.37297964075847,	602.7625487247465,	10.0},
		{36.47332495686263,	602.0718966249372,	10.0},
		{36.57355949493954,	601.4072284614915,	10.0},
		{36.673687648028874,	600.768918535986,	10.0},
		{36.77371386920887,	600.1573270799837,	10.0},
		{36.87364266928169,	599.5728004369548,	10.0},
		{36.973478614532794,	599.0156715066026,	10.0},
		{37.07322632432592,	598.4862587587796,	10.0},
		{37.17289046815881,	597.9848629973321,	10.0},
		{37.27247576382639,	597.511774005503,	10.0},
		{37.371986973776345,	597.0672596997116,	10.0},
		{37.471428903277435,	596.6515770065274,	10.0},
		{37.57080639700392,	596.2649623589064,	10.0},
		{37.67012433621644,	595.9076352751706,	10.0},
		{37.76938763607492,	595.5797991508442,	10.0},
		{37.86860124253726,	595.2816387740386,	10.0},
		{37.96777012924202,	595.0133202285364,	10.0},
		{38.06689929442556,	594.77499110124,	10.0},
		{38.16599375781175,	594.5667803171184,	10.0},
		{38.26505855779242,	594.3887998840916,	10.0},
		{38.36409874762245,	594.2411389801196,	10.0},
		{38.4631193927269,	594.1238706267283,	10.0},
		{38.56212556709341,	594.0370461990583,	10.0},
		{38.66112235058891,	593.9807009729894,	10.0},
		{38.76011482513073,	593.9548472508827,	10.0},
		{38.8591080717622,	593.9594797888585,	10.0},
		{38.9581071674427,	593.9945740829595,	10.0},
		{39.05711718143761,	594.0600839694845,	10.0},
		{39.15614317286405,	594.1559485586431,	10.0},
		{39.25519018660946,	594.2820824724351,	10.0},
		{39.35426325105919,	594.438386698344,	10.0},
		{39.4533673742218,	594.6247389756907,	10.0},
		{39.552507541087735,	594.8410011956498,	10.0},
		{39.65168871049698,	595.0870164554524,	10.0},
		{39.75091581157153,	595.3626064473298,	10.0},
		{39.8501937421984,	595.667583761187,	10.0},
		{39.94952736461521,	596.0017345008638,	10.0},
		{40.04892150325964,	596.3648318665944,	10.0},
		{40.14838094217505,	596.7566334924468,	10.0},
		{40.247910421766385,	597.1768775480311,	10.0},
		{40.34751463696727,	597.6252912053067,	10.0},
		{40.447198233416394,	598.1015786947704,	10.0},
		{40.54696580667406,	598.6054395459793,	10.0},
		{40.64682189833523,	599.1365499670336,	10.0},
		{40.746770995374945,	599.6945822382447,	10.0},
		{40.84681752530472,	600.2791795787036,	10.0},
		{40.94696585725836,	600.8899917218258,	10.0},
		{41.04722029757855,	601.5266419210974,	10.0},
		{41.147585088814566,	602.1887474161374,	10.0},
		{41.24806440826357,	602.8759166940459,	10.0},
		{41.34866236535166,	603.5877425284934,	10.0},
		{41.44938300057052,	604.3238113131807,	10.0},
		{41.550230284108814,	605.0837012297653,	10.0},
		{41.65120811336831,	605.8669755569829,	10.0},
		{41.752320313369225,	606.6732000055025,	10.0},
		{41.85357063423487,	607.501925193853,	10.0},
		{41.954962749954014,	608.3526943148856,	10.0},
		{42.056500258924586,	609.2250538234106,	10.0},
		{42.158186681095444,	610.1185330251914,	10.0},
		{42.26002545845342,	611.0326641478208,	10.0},
		{42.362019953405564,	611.9669697128566,	10.0},
		{42.46417344938312,	612.9209758653159,	10.0},
		{42.56648914888884,	613.8941970343583,	10.0},
		{42.66897017459768,	614.8861542530449,	10.0},
		{42.77161956705555,	615.8963547472722,	10.0},
		{42.87444028698537,	616.9243195788844,	10.0},
		{42.977435213226975,	617.969557449643,	10.0},
		{43.08060714234633,	619.0315747161072,	10.0},
		{43.18395879134845,	620.1098940127398,	10.0},
		{43.28749279479895,	621.2040207030063,	10.0},
		{43.39121170700762,	622.3134732519835,	10.0},
		{43.495118000394555,	623.4377603216311,	10.0},
		{43.59921406857714,	624.5764090955452,	10.0},
		{43.7035022238605,	625.7289317000625,	10.0},
		{43.80798470104204,	626.8948630893308,	10.0},
		{43.91266365384581,	628.0737168226566,	10.0},
		{44.01754115893816,	629.2650305540429,	10.0},
		{44.12261921671782,	630.4683466779943,	10.0},
		{44.227899748535066,	631.6831909034281,	10.0},
		{44.33338460174959,	632.9091192871323,	10.0},
		{44.43907554767918,	634.1456755775924,	10.0},
		{44.54497428460768,	635.3924215709865,	10.0},
		{44.65108243718364,	636.6489154556923,	10.0},
		{44.7574015580515,	637.9147252071946,	10.0},
		{44.863933129170114,	639.1894267116792,	10.0},
		{44.97067856181363,	640.4725958611086,	10.0},
		{45.07763919976292,	641.763827695713,	10.0},
		{45.184816319413315,	643.0627179023705,	10.0},
		{45.292211129903684,	644.3688629422155,	10.0},
		{45.39982477622187,	645.6818779091097,	10.0},
		{45.50765833881706,	647.0013755711183,	10.0},
		{45.61571283674497,	648.3269875674968,	10.0},
		{45.72398922761853,	649.6583452414042,	10.0},
		{45.832488408298936,	650.9950840823922,	10.0},
		{45.941211219078674,	652.336864678441,	10.0},
		{46.05015844229157,	653.6833392773347,	10.0},
		{46.15933080411866,	655.0341709625652,	10.0},
		{46.26872897785402,	656.3890424121552,	10.0},
		{46.378353583059045,	657.7476312301421,	10.0},
		{46.48820518855794,	659.1096329934065,	10.0},
		{46.598284312657505,	660.4747445973336,	10.0},
		{46.70859142489361,	661.8426734166446,	10.0},
		{46.819126949204424,	663.2131458649153,	10.0},
		{46.929891262382824,	664.5858790704036,	10.0},
		{47.04088469806867,	665.9606141151054,	10.0},
		{47.15210754630409,	667.3370894125268,	10.0},
		{47.263560056393786,	668.715060538175,	10.0},
		{47.375242436801486,	670.0942824461564,	10.0},
		{47.48715485791343,	671.4745266717289,	10.0},
		{47.59929745445492,	672.8555792489232,	10.0},
		{47.71167032286689,	674.2372104717955,	10.0},
		{47.82427352644133,	675.6192214466643,	10.0},
		{47.937107096611776,	677.0014210226585,	10.0},
		{48.050171030807626,	678.3836051751235,	10.0},
		{48.163465297302125,	679.7655989669931,	10.0},
		{48.27698983623504,	681.1472335974283,	10.0},
		{48.39074455904636,	682.5283368679437,	10.0},
		{48.50472935138439,	683.9087540281935,	10.0},
		{48.618944073688645,	685.2883338255381,	10.0},
		{48.73338856173235,	686.6669282621878,	10.0},
		{48.84806263029691,	688.0444113874136,	10.0},
		{48.96296607206168,	689.4206505886564,	10.0},
		{49.07809865923995,	690.7955230695511,	10.0},
		{49.1934601462343,	692.1689219661151,	10.0},
		{49.30905026928063,	693.5407382780004,	10.0},
		{49.4248687477051,	694.9108705468096,	10.0},
		{49.54091528612698,	696.2792305312801,	10.0},
		{49.65718957416252,	697.6457282132785,	10.0},
		{49.773691288615176,	699.0102867158847,	10.0},
		{49.89042009534861,	700.3728404006098,	10.0},
		{50.00737564760557,	701.7333135417554,	10.0},
		{50.12455759018795,	703.0916554942785,	10.0},
		{50.2419655579951,	704.447806842915,	10.0},
		{50.359599178634035,	705.8017238336432,	10.0},
		{50.47745807270668,	707.1533644359243,	10.0},
		{50.59554185576556,	708.5026983532277,	10.0},
		{50.71385013656077,	709.8496847713343,	10.0},
		{50.83238252305856,	711.194318986705,	10.0},
		{50.951138617401526,	712.5365660577916,	10.0},
		{51.07011802076026,	713.8764201524316,	10.0},
		{51.189320334195436,	715.2138806110013,	10.0},
		{51.30874515681327,	716.5489357070114,	10.0},
		{51.42839208984519,	717.8815981915636,	10.0},
		{51.54826073536161,	719.2118730985324,	10.0},
		{51.66835069771992,	720.539774149825,	10.0},
		{51.788661584783995,	721.8653223844686,	10.0},
		{51.90919300795005,	723.188538996366,	10.0},
		{52.029944584439654,	724.5094589375767,	10.0},
		{52.15091593536057,	725.8281055254853,	10.0},
		{52.27210669104577,	727.1445341112016,	10.0},
		{52.39351648605997,	728.4587700852429,	10.0},
		{52.5151449642668,	729.7708692409398,	10.0},
		{52.63699177784288,	731.0808814564449,	10.0},
		{52.75905658979571,	732.3888717169433,	10.0},
		{52.881339070533215,	733.694884425028,	10.0},
		{53.003838903899464,	734.9990001974757,	10.0},
		{53.126555784150106,	736.3012815038903,	10.0},
		{53.249489417409436,	737.601799555945,	10.0},
		{53.372639523606495,	738.9006371823286,	10.0},
		{53.496005835580455,	740.197871843784,	10.0},
		{53.619588101255474,	741.493594050107,	10.0},
		{53.74338608308493,	742.7878909767312,	10.0},
		{53.86739955878478,	744.08085419908,	10.0},
		{53.99162832294953,	745.3725849885413,	10.0},
		{54.116072186787584,	746.6631830283065,	10.0},
		{54.24073097955741,	747.9527566189896,	10.0},
		{54.365604548346845,	749.2414127365911,	10.0},
		{54.4906927595516,	750.5292672285699,	10.0},
		{54.61599549757227,	751.8164281239857,	10.0},
		{54.741512669783305,	753.1030332661978,	10.0},
		{54.86724420195417,	754.389193025197,	10.0},
		{54.99319004208343,	755.675040775494,	10.0},
		{55.119350160260616,	756.960709063141,	10.0},
		{55.24572454951231,	758.246335510122,	10.0},
		{55.37231322675577,	759.5320634607618,	10.0},
		{55.49911623078298,	760.8180241632119,	10.0},
		{55.62613362765304,	762.1043812203378,	10.0},
		{55.753365507203796,	763.3912773045697,	10.0},
		{55.880811985486474,	764.678869696043,	10.0},
		{56.00847320538489,	765.9673193904351,	10.0},
		{56.13634933710827,	767.2567903404062,	10.0},
		{56.264440577686344,	768.5474434684016,	10.0},
		{56.39274715487004,	769.8394631021671,	10.0},
		{56.52123062962099,	770.9008485057111,	10.0},
		{56.64978791012855,	771.3436830454098,	10.0},
		{56.77828953763999,	771.009765068671,	10.0},
		{56.90660522047656,	769.8940970193286,	10.0},
		{57.03460383531105,	767.9916890070897,	10.0},
		{57.162153433028315,	765.2975863035613,	10.0},
		{57.28912124239807,	761.806856218544,	10.0},
		{57.415373678071404,	757.5146140399554,	10.0},
		{57.54077634772074,	752.416017896031,	10.0},
		{57.66519406399633,	746.506297653482,	10.0},
		{57.7884908569525,	739.7807577370601,	10.0},
		{57.91052998606942,	732.2347747014736,	10.0},
		{58.03117395900158,	723.863837593008,	10.0},
		{58.150284547569,	714.6635314044956,	10.0},
		{58.26772280903257,	704.6295687814087,	10.0},
		{58.38334910899063,	693.7577997483476,	10.0},
		{58.49702314524327,	682.0442175157611,	10.0},
		{58.60860397584829,	669.4849836301581,	10.0},
		{58.71795004866185,	656.0764368813434,	10.0},
		{58.8249192341147,	641.8151127170531,	10.0},
		{58.92940877847659,	626.9372661713845,	10.0},
		{59.03138206933744,	611.8397451650792,	10.0},
		{59.130829070490336,	596.6820069173662,	10.0},
		{59.227739963319806,	581.4653569767853,	10.0},
		{59.32210514835456,	566.1911102085768,	10.0},
		{59.41391524650402,	550.8605888967134,	10.0},
		{59.50316110008809,	535.4751215044861,	10.0},
		{59.58983377542017,	520.0360519924109,	10.0},
		{59.673924563631026,	504.5447292651988,	10.0},
		{59.755424983825236,	489.0025211652789,	10.0},
		{59.834326784596996,	473.4108046305743,	10.0},
		{59.91062194691596,	457.77097391373877,	10.0},
		{59.984302686501486,	442.0844375132097,	10.0},
		{60.055361456440416,	426.3526196335681,	10.0},
		{60.12379095035936,	410.5769635136706,	10.0},
		{60.189584104935875,	394.7589274591094,	10.0},
		{60.25273410299364,	378.89998834656257,	10.0},
		{60.31323437660991,	363.001641697582,	10.0},
		{60.37107860991835,	347.06539985062005,	10.0},
		{60.426260742624194,	331.092796235103,	10.0},
		{60.478774972532136,	315.08537944763845,	10.0},
		{60.52861575897309,	299.0447186457262,	10.0},
		{60.57577782588367,	282.97240146339993,	10.0},
		{60.620256164451355,	266.8700314061134,	10.0},
		{60.662046036338005,	250.73923131984242,	10.0},
		{60.70114297633504,	234.58163998221963,	10.0},
		{60.737542795245204,	218.39891346101234,	10.0},
		{60.77124158244221,	202.19272318204625,	10.0},
		{60.80223570842541,	185.96475589922704,	10.0},
		{60.830521827152836,	169.71671236449214,	10.0},
		{60.85613781528589,	153.69592879839632,	10.0},
		{60.879189950540834,	138.3128115296191,	10.0},
		{60.899812031710866,	123.7324870201629,	10.0},
		{60.91813824930271,	109.95730555107053,	10.0},
		{60.93430314412945,	96.98936896050635,	10.0},
		{60.94844156796032,	84.83054298516561,	10.0},
		{60.9606886463506,	73.48247034167748,	10.0},
		{60.97117974367472,	62.94658394472261,	10.0},
		{60.98005043047159,	53.22412078124011,	10.0},
		{60.98743645304825,	44.31613545997743,	10.0},
		{60.9934737054633,	36.2235144903139,	10.0},
		{60.99829820387142,	28.94699044874913,	10.0},
		{61.002046063294586,	22.487156539001504,	10.0},
		{61.00485347680885,	16.8444810855843,	10.0},
		{61.006856697178144,	12.019322215792409,	10.0},
		{61.00819202096045,	8.011942693785256,	10.0},
		{61.00899577507628,	4.822524694985797,	10.0},
		{61.00940430586319,	2.451184721496858,	10.0},
		{61.00955397061359,	0.8979885023590908,	10.0},
		{61.009581131601045,	0.1629659247704817,	10.0},
		{61.009581131601045,	0.0,	10.0}};

		//A: uses a loop to make a copy of the points
		public static double[][] getUpdatedPoints ()
		{
			double[][] PointsCopy = new double[Points.length][Points[0].length];
			for (int i = 0; i < Points.length; i++)
			{
				PointsCopy[i][0] = -Points[i][0];
				PointsCopy[i][1] = -Points[i][1];
				PointsCopy[i][2] = Points[i][2];
			}
			return PointsCopy;
		}		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}			