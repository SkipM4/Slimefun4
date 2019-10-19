package me.mrCookieSlime.Slimefun.Setup;

import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Localization;

public final class Messages {

    private Messages(){}
	
	public static Localization local;
	
	public static void setup() {
        local.setPrefix("&aSlimefun &7> ");
        local.setDefault("commands.help",   "展示这个帮助界面" );
        local.setDefault("commands.cheat",   "允许你通过作弊获取粘液科技物品" );
        local.setDefault("commands.give",   "给某人粘液科技物品" );
        local.setDefault("commands.research.desc",   "为某位玩家解锁一个研究" );
        local.setDefault("commands.guide",   "给你自己一本粘液科技指南" );
        local.setDefault("commands.timings",   "关于 Slimefun 的耗能信息" );
        local.setDefault("commands.teleporter",   "看看其他玩家的路径点" );
        local.setDefault("commands.versions",   "显示粘液科技的版本号" );
        local.setDefault("commands.open_guide",   "不用粘液科技指南书就能打开指南" );
        local.setDefault("commands.research.reset",   "&c你已重置了 %player% 的所有研究" );
        local.setDefault("commands.research.reset-target",   "&c你的所有研究已被重置" );
        local.setDefault("commands.stats",   "展示一个玩家的统计表" );

        local.setDefault("messages.only-players",   "&4这个指令只能在游戏内使用" );
        local.setDefault("messages.no-permission",   "&4你没有权限去做这个" );
        local.setDefault("messages.usage",   "&4例子: &c%usage%" );
        local.setDefault("messages.not-online",   "&4%player% &c不在线!" );
        local.setDefault("messages.not-valid-item",   "&4%item% &c不是一个粘液科技物品!" );
        local.setDefault("messages.given-item",   "&b你收到了一个 &7\"%item%\"" );
        local.setDefault("messages.give-item",   "&b你给予了玩家 %player% 一个 &7\"%item%\"" );
        local.setDefault("messages.not-valid-research",   "&4%research% &c不是一个有效的研究名!" );
        local.setDefault("messages.give-research",   "&b你成功解锁了玩家 %player% 的研究 &7\"%research%\"" );
        local.setDefault("messages.battery.add",   "&2+ &7%charge% J &8(%machine%)" );
        local.setDefault("messages.battery.remove",   "&4- &7%charge% J &8(%machine%)" );
        local.setDefault("messages.hungry",   "&c你太饿了, 先吃点东西再这么做吧!" );
        local.setDefault("messages.mode-change",   "&b%device% 的模式已切换至: &9%mode%" );
        local.setDefault("messages.disabled-in-world",   "&4&l这个物品在此世界已被禁用" );
        local.setDefault("messages.talisman.anvil",   "&a&o你的护身符拯救了你的工具免于损坏" );
        local.setDefault("messages.talisman.miner",   "&a&o你的护身符使矿物双倍掉落了" );
        local.setDefault("messages.talisman.hunter",   "&a&o你的护身符使掉落物双倍掉落了" );
        local.setDefault("messages.talisman.lava",   "&a&o你的护身符将你从岩浆中救了出来" );
        local.setDefault("messages.talisman.water",   "&a&o你的护身符将你从溺水中救了出来" );
        local.setDefault("messages.talisman.angel",   "&a&o你的护身符将你从信仰之跃中救了出来" );
        local.setDefault("messages.talisman.fire",   "&a&o你的护身符将你从火焰中救了出来" );
        local.setDefault("messages.talisman.magician",   "&a&o你的护身符赠送了你额外的附魔" );
        local.setDefault("messages.talisman.traveller",   "&a&o你的护身符使你跑起来更快了" );
        local.setDefault("messages.talisman.warrior",   "&a&o你的护身符使你在一段时间内变得很强" );
        local.setDefault("messages.talisman.knight",   "&a&o你的护身符给予了你 5 秒的生命恢复" );
        local.setDefault("messages.talisman.whirlwind",   "&a&o你的护身符抵挡了所有的弹射物" );
        local.setDefault("messages.talisman.wizard",   "&a&o你的护身符使一个更好的附魔的等级提高了, 但同时其他附魔等级将会下降." );
        local.setDefault("messages.soulbound-rune.fail", "&c你一次只能绑定一个物品.");
        local.setDefault("messages.soulbound-rune.success", "&a物品绑定成功! 在你死亡后物品将不会掉落.");
        local.setDefault("messages.broken-leg",   "&c&o看起来你摔断了你的腿, 也许夹板能够帮助你?" );
        local.setDefault("messages.fixed-leg",   "&a&o有了夹板的帮助. 感觉好多了." );
        local.setDefault("messages.start-bleeding",   "&c&o你开始流血了. 也许绷带能够帮助你?" );
        local.setDefault("messages.stop-bleeding",   "&a&o有了绷带的帮助. 流血停止了!" );
        local.setDefault("messages.disabled-item",   "&4&l这个物品已被禁用了! 你是怎么得到它的?" );
        local.setDefault("messages.research.start",   "&7古老的灵魂正向你诉说神秘的话语!" );
        local.setDefault("messages.research.progress",   "&7你开始慢慢理解 &b%research% &e(%progress%)" );
        local.setDefault("messages.fire-extinguish",   "&7你灭掉了你身上的火" );
        local.setDefault("messages.not-researched",   "&4你没有足够的学识来理解它" );
        local.setDefault("messages.not-enough-xp",   "&4你没有足够的经验来解锁这个研究" );
        local.setDefault("messages.unlocked",   "&b你已解锁了 &7\"%research%\"" );
        local.setDefault("messages.fortune-cookie",   "&7救救我! 我被困在了幸运饼干工厂里!", "&7你明天将会死于...     苦力怕的手下!", "&7在你人生的某时某刻将会有坏事发生!!!", "&7下周你将会发现你不是在现实世界, 而是在游戏里.", "&7这块曲奇将在几秒内变得好吃", "&你很快将会死亡而且你最后听到的词将会是 \"毁灭!!!\"", "&7无论你要做什么, 不要拥抱苦力怕... 我试过了. 感觉不错, 但不值得." );
    	local.setDefault("messages.cannot-place","&c你不能在这里放置方块!");
        local.setDefault("messages.no-pvp" ,"&c你不能在这里 PVP!");

        local.setDefault("gps.waypoint.new",   "&e请为你的路径点起名 &7(支持彩色代码!)" );
        local.setDefault("gps.waypoint.added",   "&a成功新增了新的路径点" );
        local.setDefault("gps.waypoint.max",   "&4你已到达设置路径点的最大上限!" );
        local.setDefault("gps.insufficient-complexity",   "&4GPS 网络复杂度不够: &c%complexity%", "&4a) 你还没有设置一个 GPS 网络", "&4b) 你的 GPS 网络复杂度不够, 多设置几个 GPS 发射机" );
        local.setDefault("gps.geo.scan-required",   "&4需要先进行地形扫描! &c请先使用地形扫描器!" );

        local.setDefault("robot.started",   "&7你的机器人重新运行了它的脚本" );
        local.setDefault("robot.stopped",   "&7你的机器人暂停了它的脚本" );

        local.setDefault("machines.pattern-not-found",   "&e抱歉, 你记错合成表了吧. 这不是一个正确的合成方式." );
        local.setDefault("machines.unknown-material",   "&e抱歉, 我无法识别你摆放的合成表. 请使用正确的合成表!" );
        local.setDefault("machines.wrong-item",   "&e抱歉, 我无法识别你右键的物品. 检查合成表看看哪些物品可以使用." );
        local.setDefault("machines.full-inventory",   "&e抱歉, 我的背包已经满了!" );
        local.setDefault("machines.in-use",   "&c这个机器正在被其他玩家使用." );
        local.setDefault("machines.ignition-chamber-no-flint", "&c自动点火机缺少打火石.");
        local.setDefault("machines.ANCIENT_ALTAR.not-enough-pedestals",   "&4基座不足. 目前已摆放的基座: &c(%pedestals% / 8)" );
        local.setDefault("machines.ANCIENT_ALTAR.unknown-catalyst",   "&4无效的合成配方! &c请先摆放其他物品再右键!" );
        local.setDefault("machines.ANCIENT_ALTAR.unknown-recipe",   "&4未知合成表! &c请使用正确的合成方式! 如果确认没错请将摆放的物品旋转 90 度重试." );
        local.setDefault("machines.HOLOGRAM_PROJECTOR.enter-text",   "&7请写下想显示在全息文本上的话. &r(支持颜色代码)" );
        local.setDefault("machines.ELEVATOR.no-destinations",   "&4找不到目的地 (检查上/下方是否也放置了电梯)" );
        local.setDefault("machines.CARGO_NODES.must-be-placed",   "&4必须放置在箱子或机器上!" );

        local.setDefault("android.scripts.already-uploaded",   "&4这个脚本已被上传过了." );
        local.setDefault("android.scripts.enter-name",   "", "&e请为你的脚本命名", "" );
        local.setDefault("android.scripts.uploaded",   "&b上传中...", "&a成功上传了你的脚本!" );
        local.setDefault("android.scripts.rating.own",   "&4你不能评价你自己的脚本!" );
        local.setDefault("android.scripts.rating.already",   "&4你已为这个脚本留下评价了!" );


        local.setDefault("miner.no-ores",   "&e抱歉, 周围找不到矿石了!" );

        local.setDefault("backpack.already-open",   "&c抱歉, 这个背包已在别处打开了!" );
        local.setDefault("backpack.no-stack",   "&c你不能将背包堆积起来" );

        local.setDefault("workbench.not-enhanced",   "&4你不能在原版工作台使用粘液科技物品" );
        local.setDefault("anvil.not-working",   "&4你不能在铁砧里使用粘液科技物品" );
        local.setDefault("inventory.no-access",   "&4你不允许使用这个方块" );

        local.setDefault("tooltips.item-permission", "", "&r你没有权限", "&r使用这个物品");

        local.setDefault("translated.by", "Namelessssss");

		local.save();
	}
}