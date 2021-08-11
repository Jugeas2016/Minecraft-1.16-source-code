/*     */ import com.mojang.bridge.Bridge;
/*     */ import com.mojang.bridge.game.GameSession;
/*     */ import com.mojang.bridge.game.GameVersion;
/*     */ import com.mojang.bridge.game.Language;
/*     */ import com.mojang.bridge.game.PerformanceMetrics;
/*     */ import com.mojang.bridge.game.RunningGame;
/*     */ import com.mojang.bridge.launcher.Launcher;
/*     */ import com.mojang.bridge.launcher.SessionEventListener;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class djs
/*     */   implements RunningGame
/*     */ {
/*     */   private final djz a;
/*     */   @Nullable
/*     */   private final Launcher b;
/*  21 */   private SessionEventListener c = SessionEventListener.NONE;
/*     */   
/*     */   public djs(djz ☃) {
/*  24 */     this.a = ☃;
/*  25 */     this.b = Bridge.getLauncher();
/*     */     
/*  27 */     if (this.b != null) {
/*  28 */       this.b.registerGame(this);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public GameVersion getVersion() {
/*  34 */     return w.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public Language getSelectedLanguage() {
/*  39 */     return this.a.R().b();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public GameSession getCurrentSession() {
/*  45 */     dwt ☃ = this.a.r;
/*  46 */     return (☃ == null) ? null : new dki(☃, this.a.s, this.a.s.e);
/*     */   }
/*     */ 
/*     */   
/*     */   public PerformanceMetrics getPerformanceMetrics() {
/*  51 */     afc ☃ = this.a.ag();
/*  52 */     long l1 = 2147483647L;
/*  53 */     long l2 = -2147483648L;
/*  54 */     long l3 = 0L;
/*  55 */     for (long l : ☃.c()) {
/*  56 */       l1 = Math.min(l1, l);
/*  57 */       l2 = Math.max(l2, l);
/*  58 */       l3 += l;
/*     */     } 
/*  60 */     return new a((int)l1, (int)l2, (int)(l3 / (☃.c()).length), (☃.c()).length);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSessionEventListener(SessionEventListener ☃) {
/*  65 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public void a() {
/*  69 */     this.c.onStartGameSession(getCurrentSession());
/*     */   }
/*     */   
/*     */   public void b() {
/*  73 */     this.c.onLeaveGameSession(getCurrentSession());
/*     */   }
/*     */   
/*     */   static class a implements PerformanceMetrics {
/*     */     private final int a;
/*     */     private final int b;
/*     */     private final int c;
/*     */     private final int d;
/*     */     
/*     */     public a(int ☃, int i, int j, int k) {
/*  83 */       this.a = ☃;
/*  84 */       this.b = i;
/*  85 */       this.c = j;
/*  86 */       this.d = k;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getMinTime() {
/*  91 */       return this.a;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getMaxTime() {
/*  96 */       return this.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getAverageTime() {
/* 101 */       return this.c;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getSampleCount() {
/* 106 */       return this.d;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */