/*     */ import java.util.Collection;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ddo
/*     */   extends cxs
/*     */ {
/*  17 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private ddn b;
/*     */   
/*     */   private md c;
/*     */   
/*     */   public ddo() {
/*  24 */     super("scoreboard");
/*     */   }
/*     */   
/*     */   public void a(ddn ☃) {
/*  28 */     this.b = ☃;
/*     */     
/*  30 */     if (this.c != null) {
/*  31 */       a(this.c);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/*  37 */     if (this.b == null) {
/*  38 */       this.c = ☃;
/*     */       
/*     */       return;
/*     */     } 
/*  42 */     b(☃.d("Objectives", 10));
/*  43 */     this.b.a(☃.d("PlayerScores", 10));
/*     */     
/*  45 */     if (☃.c("DisplaySlots", 10)) {
/*  46 */       c(☃.p("DisplaySlots"));
/*     */     }
/*     */     
/*  49 */     if (☃.c("Teams", 9)) {
/*  50 */       a(☃.d("Teams", 10));
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(mj ☃) {
/*  55 */     for (int i = 0; i < ☃.size(); i++) {
/*  56 */       md md1 = ☃.a(i);
/*     */       
/*  58 */       String str = md1.l("Name");
/*  59 */       if (str.length() > 16)
/*     */       {
/*  61 */         str = str.substring(0, 16);
/*     */       }
/*  63 */       ddl ddl = this.b.g(str);
/*  64 */       nr nr = nr.a.a(md1.l("DisplayName"));
/*  65 */       if (nr != null) {
/*  66 */         ddl.a(nr);
/*     */       }
/*  68 */       if (md1.c("TeamColor", 8)) {
/*  69 */         ddl.a(k.b(md1.l("TeamColor")));
/*     */       }
/*  71 */       if (md1.c("AllowFriendlyFire", 99)) {
/*  72 */         ddl.a(md1.q("AllowFriendlyFire"));
/*     */       }
/*  74 */       if (md1.c("SeeFriendlyInvisibles", 99)) {
/*  75 */         ddl.b(md1.q("SeeFriendlyInvisibles"));
/*     */       }
/*  77 */       if (md1.c("MemberNamePrefix", 8)) {
/*  78 */         nr nr1 = nr.a.a(md1.l("MemberNamePrefix"));
/*  79 */         if (nr1 != null) {
/*  80 */           ddl.b(nr1);
/*     */         }
/*     */       } 
/*  83 */       if (md1.c("MemberNameSuffix", 8)) {
/*  84 */         nr nr1 = nr.a.a(md1.l("MemberNameSuffix"));
/*  85 */         if (nr1 != null) {
/*  86 */           ddl.c(nr1);
/*     */         }
/*     */       } 
/*  89 */       if (md1.c("NameTagVisibility", 8)) {
/*  90 */         ddp.b b = ddp.b.a(md1.l("NameTagVisibility"));
/*  91 */         if (b != null) {
/*  92 */           ddl.a(b);
/*     */         }
/*     */       } 
/*  95 */       if (md1.c("DeathMessageVisibility", 8)) {
/*  96 */         ddp.b b = ddp.b.a(md1.l("DeathMessageVisibility"));
/*  97 */         if (b != null) {
/*  98 */           ddl.b(b);
/*     */         }
/*     */       } 
/* 101 */       if (md1.c("CollisionRule", 8)) {
/* 102 */         ddp.a a = ddp.a.a(md1.l("CollisionRule"));
/* 103 */         if (a != null) {
/* 104 */           ddl.a(a);
/*     */         }
/*     */       } 
/*     */       
/* 108 */       a(ddl, md1.d("Players", 8));
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(ddl ☃, mj mj1) {
/* 113 */     for (int i = 0; i < mj1.size(); i++) {
/* 114 */       this.b.a(mj1.j(i), ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void c(md ☃) {
/* 119 */     for (int i = 0; i < 19; i++) {
/* 120 */       if (☃.c("slot_" + i, 8)) {
/* 121 */         String str = ☃.l("slot_" + i);
/* 122 */         ddk ddk = this.b.d(str);
/* 123 */         this.b.a(i, ddk);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void b(mj ☃) {
/* 129 */     for (int i = 0; i < ☃.size(); i++) {
/* 130 */       md md1 = ☃.a(i);
/* 131 */       ddq.a(md1.l("CriteriaName")).ifPresent(ddq1 -> {
/*     */             String str = ☃.l("Name");
/*     */             if (str.length() > 16) {
/*     */               str = str.substring(0, 16);
/*     */             }
/*     */             nr nr = nr.a.a(☃.l("DisplayName"));
/*     */             ddq.a a = ddq.a.a(☃.l("RenderType"));
/*     */             this.b.a(str, ddq1, nr, a);
/*     */           });
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public md b(md ☃) {
/* 146 */     if (this.b == null) {
/* 147 */       a.warn("Tried to save scoreboard without having a scoreboard...");
/* 148 */       return ☃;
/*     */     } 
/*     */     
/* 151 */     ☃.a("Objectives", e());
/* 152 */     ☃.a("PlayerScores", this.b.i());
/* 153 */     ☃.a("Teams", a());
/*     */     
/* 155 */     d(☃);
/*     */     
/* 157 */     return ☃;
/*     */   }
/*     */   
/*     */   protected mj a() {
/* 161 */     mj ☃ = new mj();
/* 162 */     Collection<ddl> collection = this.b.g();
/*     */     
/* 164 */     for (ddl ddl : collection) {
/* 165 */       md md1 = new md();
/*     */       
/* 167 */       md1.a("Name", ddl.b());
/* 168 */       md1.a("DisplayName", nr.a.a(ddl.c()));
/* 169 */       if (ddl.n().b() >= 0) {
/* 170 */         md1.a("TeamColor", ddl.n().f());
/*     */       }
/* 172 */       md1.a("AllowFriendlyFire", ddl.h());
/* 173 */       md1.a("SeeFriendlyInvisibles", ddl.i());
/* 174 */       md1.a("MemberNamePrefix", nr.a.a(ddl.e()));
/* 175 */       md1.a("MemberNameSuffix", nr.a.a(ddl.f()));
/* 176 */       md1.a("NameTagVisibility", (ddl.j()).e);
/* 177 */       md1.a("DeathMessageVisibility", (ddl.k()).e);
/* 178 */       md1.a("CollisionRule", (ddl.l()).e);
/*     */       
/* 180 */       mj mj = new mj();
/*     */       
/* 182 */       for (String str : ddl.g()) {
/* 183 */         mj.add(ms.a(str));
/*     */       }
/*     */       
/* 186 */       md1.a("Players", mj);
/*     */       
/* 188 */       ☃.add(md1);
/*     */     } 
/*     */     
/* 191 */     return ☃;
/*     */   }
/*     */   
/*     */   protected void d(md ☃) {
/* 195 */     md md1 = new md();
/* 196 */     boolean bool = false;
/*     */     
/* 198 */     for (int i = 0; i < 19; i++) {
/* 199 */       ddk ddk = this.b.a(i);
/*     */       
/* 201 */       if (ddk != null) {
/* 202 */         md1.a("slot_" + i, ddk.b());
/* 203 */         bool = true;
/*     */       } 
/*     */     } 
/*     */     
/* 207 */     if (bool) {
/* 208 */       ☃.a("DisplaySlots", md1);
/*     */     }
/*     */   }
/*     */   
/*     */   protected mj e() {
/* 213 */     mj ☃ = new mj();
/* 214 */     Collection<ddk> collection = this.b.c();
/*     */     
/* 216 */     for (ddk ddk : collection) {
/* 217 */       if (ddk.c() == null) {
/*     */         continue;
/*     */       }
/*     */       
/* 221 */       md md1 = new md();
/* 222 */       md1.a("Name", ddk.b());
/* 223 */       md1.a("CriteriaName", ddk.c().c());
/* 224 */       md1.a("DisplayName", nr.a.a(ddk.d()));
/* 225 */       md1.a("RenderType", ddk.f().a());
/* 226 */       ☃.add(md1);
/*     */     } 
/*     */     
/* 229 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */