/*    */ import java.nio.file.Path;
/*    */ import java.util.Properties;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class zh
/*    */   extends zk<zh>
/*    */ {
/* 17 */   public final boolean a = a("online-mode", true);
/* 18 */   public final boolean b = a("prevent-proxy-connections", false);
/* 19 */   public final String c = a("server-ip", "");
/* 20 */   public final boolean d = a("spawn-animals", true);
/* 21 */   public final boolean e = a("spawn-npcs", true);
/* 22 */   public final boolean f = a("pvp", true);
/* 23 */   public final boolean g = a("allow-flight", false);
/* 24 */   public final String h = a("resource-pack", "");
/* 25 */   public final String i = a("motd", "A Minecraft Server");
/* 26 */   public final boolean j = a("force-gamemode", false);
/* 27 */   public final boolean k = a("enforce-whitelist", false);
/* 28 */   public final aor l = (aor)a("difficulty", a(aor::a, aor::a), aor::c, aor.b);
/* 29 */   public final bru m = (bru)a("gamemode", a(bru::a, bru::a), bru::b, bru.b);
/* 30 */   public final String n = a("level-name", "world");
/* 31 */   public final int o = a("server-port", 25565);
/*    */   
/*    */   public final int p;
/*    */   
/*    */   public final Boolean q;
/*    */   
/*    */   public final boolean r;
/*    */   public final int s;
/*    */   public final boolean t;
/*    */   public final int u;
/*    */   public final String v;
/*    */   public final String w;
/*    */   public final String x;
/*    */   public final boolean y;
/*    */   public final boolean z;
/*    */   public final boolean A;
/*    */   public final boolean B;
/*    */   public final boolean C;
/*    */   public final boolean D;
/*    */   public final int E;
/*    */   public final int F;
/*    */   public final int G;
/*    */   public final long H;
/*    */   public final int I;
/*    */   public final int J;
/*    */   public final int K;
/*    */   public final int L;
/*    */   public final boolean M;
/*    */   public final boolean N;
/*    */   public final int O;
/*    */   public final boolean P;
/*    */   public final boolean Q;
/*    */   public final boolean R;
/*    */   public final int S;
/*    */   public final String T;
/*    */   public final zk<zh>.a<Integer> U;
/*    */   public final zk<zh>.a<Boolean> V;
/*    */   public final chw W;
/*    */   
/*    */   public zh(Properties ☃, gn gn1) {
/* 71 */     super(☃); this.p = a("max-build-height", ☃ -> Integer.valueOf(afm.a((☃.intValue() + 8) / 16 * 16, 64, 256)), 256); this.q = b("announce-player-achievements"); this.r = a("enable-query", false); this.s = a("query.port", 25565); this.t = a("enable-rcon", false); this.u = a("rcon.port", 25575); this.v = a("rcon.password", ""); this.w = a("resource-pack-hash"); this.x = a("resource-pack-sha1", ""); this.y = a("hardcore", false); this.z = a("allow-nether", true); this.A = a("spawn-monsters", true); if (a("snooper-enabled", true)); this.B = false; this.C = a("use-native-transport", true); this.D = a("enable-command-block", false); this.E = a("spawn-protection", 16); this.F = a("op-permission-level", 4); this.G = a("function-permission-level", 2); this.H = a("max-tick-time", TimeUnit.MINUTES.toMillis(1L)); this.I = a("rate-limit", 0); this.J = a("view-distance", 10); this.K = a("max-players", 20); this.L = a("network-compression-threshold", 256); this.M = a("broadcast-rcon-to-ops", true); this.N = a("broadcast-console-to-ops", true); this.O = a("max-world-size", ☃ -> Integer.valueOf(afm.a(☃.intValue(), 1, 29999984)), 29999984); this.P = a("sync-chunk-writes", true); this.Q = a("enable-jmx-monitoring", false); this.R = a("enable-status", true); this.S = a("entity-broadcast-range-percentage", ☃ -> Integer.valueOf(afm.a(☃.intValue(), 10, 1000)), 100); this.T = a("text-filtering-config", ""); this.U = b("player-idle-timeout", 0); this.V = b("white-list", false);
/* 72 */     this.W = chw.a(gn1, ☃);
/*    */   }
/*    */   
/*    */   public static zh a(gn ☃, Path path) {
/* 76 */     return new zh(a(path), ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected zh a(gn ☃, Properties properties) {
/* 81 */     return new zh(properties, ☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */