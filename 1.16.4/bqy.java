/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.UUID;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class bqy
/*     */   implements da
/*     */ {
/*  25 */   private static final SimpleDateFormat b = new SimpleDateFormat("HH:mm:ss");
/*  26 */   private static final nr c = new oe("@");
/*     */   
/*  28 */   private long d = -1L;
/*     */   private boolean e = true;
/*     */   private int f;
/*     */   private boolean g = true;
/*     */   @Nullable
/*     */   private nr h;
/*  34 */   private String i = "";
/*  35 */   private nr j = c;
/*     */   
/*     */   public int i() {
/*  38 */     return this.f;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  42 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   public nr j() {
/*  46 */     return (this.h == null) ? oe.d : this.h;
/*     */   }
/*     */   
/*     */   public md a(md ☃) {
/*  50 */     ☃.a("Command", this.i);
/*  51 */     ☃.b("SuccessCount", this.f);
/*  52 */     ☃.a("CustomName", nr.a.a(this.j));
/*  53 */     ☃.a("TrackOutput", this.g);
/*  54 */     if (this.h != null && this.g) {
/*  55 */       ☃.a("LastOutput", nr.a.a(this.h));
/*     */     }
/*  57 */     ☃.a("UpdateLastExecution", this.e);
/*  58 */     if (this.e && this.d > 0L) {
/*  59 */       ☃.a("LastExecution", this.d);
/*     */     }
/*     */     
/*  62 */     return ☃;
/*     */   }
/*     */   
/*     */   public void b(md ☃) {
/*  66 */     this.i = ☃.l("Command");
/*  67 */     this.f = ☃.h("SuccessCount");
/*  68 */     if (☃.c("CustomName", 8)) {
/*  69 */       a(nr.a.a(☃.l("CustomName")));
/*     */     }
/*  71 */     if (☃.c("TrackOutput", 1)) {
/*  72 */       this.g = ☃.q("TrackOutput");
/*     */     }
/*  74 */     if (☃.c("LastOutput", 8) && this.g) {
/*     */       try {
/*  76 */         this.h = nr.a.a(☃.l("LastOutput"));
/*  77 */       } catch (Throwable throwable) {
/*  78 */         this.h = new oe(throwable.getMessage());
/*     */       } 
/*     */     } else {
/*  81 */       this.h = null;
/*     */     } 
/*  83 */     if (☃.e("UpdateLastExecution")) {
/*  84 */       this.e = ☃.q("UpdateLastExecution");
/*     */     }
/*  86 */     if (this.e && ☃.e("LastExecution")) {
/*  87 */       this.d = ☃.i("LastExecution");
/*     */     } else {
/*  89 */       this.d = -1L;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/*  94 */     this.i = ☃;
/*  95 */     this.f = 0;
/*     */   }
/*     */   
/*     */   public String k() {
/*  99 */     return this.i;
/*     */   }
/*     */   
/*     */   public boolean a(brx ☃) {
/* 103 */     if (☃.v || ☃.T() == this.d) {
/* 104 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 108 */     if ("Searge".equalsIgnoreCase(this.i)) {
/* 109 */       this.h = new oe("#itzlipofutzli");
/* 110 */       this.f = 1;
/* 111 */       return true;
/*     */     } 
/*     */     
/* 114 */     this.f = 0;
/*     */     
/* 116 */     MinecraftServer minecraftServer = d().l();
/* 117 */     if (minecraftServer.m() && !aft.b(this.i)) {
/*     */       try {
/* 119 */         this.h = null;
/* 120 */         db db = h().a((☃, bool, i) -> {
/*     */               if (bool) {
/*     */                 this.f++;
/*     */               }
/*     */             });
/* 125 */         minecraftServer.aD().a(db, this.i);
/* 126 */       } catch (Throwable throwable) {
/* 127 */         l l = l.a(throwable, "Executing command block");
/* 128 */         m m = l.a("Command to be executed");
/*     */         
/* 130 */         m.a("Command", this::k);
/*     */         
/* 132 */         m.a("Name", () -> l().getString());
/*     */         
/* 134 */         throw new u(l);
/*     */       } 
/*     */     }
/*     */     
/* 138 */     if (this.e) {
/* 139 */       this.d = ☃.T();
/*     */     } else {
/* 141 */       this.d = -1L;
/*     */     } 
/*     */     
/* 144 */     return true;
/*     */   }
/*     */   
/*     */   public nr l() {
/* 148 */     return this.j;
/*     */   }
/*     */   
/*     */   public void a(@Nullable nr ☃) {
/* 152 */     if (☃ != null) {
/* 153 */       this.j = ☃;
/*     */     } else {
/* 155 */       this.j = c;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nr ☃, UUID uUID) {
/* 161 */     if (this.g) {
/* 162 */       this.h = (new oe("[" + b.format(new Date()) + "] ")).a(☃);
/* 163 */       e();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(@Nullable nr ☃) {
/* 172 */     this.h = ☃;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 176 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 180 */     return this.g;
/*     */   }
/*     */   
/*     */   public aou a(bfw ☃) {
/* 184 */     if (!☃.eV()) {
/* 185 */       return aou.c;
/*     */     }
/* 187 */     if ((☃.cg()).v) {
/* 188 */       ☃.a(this);
/*     */     }
/* 190 */     return aou.a(☃.l.v);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 199 */     return (d().V().b(brt.n) && this.g);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 204 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean R_() {
/* 209 */     return d().V().b(brt.h);
/*     */   }
/*     */   
/*     */   public abstract aag d();
/*     */   
/*     */   public abstract void e();
/*     */   
/*     */   public abstract dcn f();
/*     */   
/*     */   public abstract db h();
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bqy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */