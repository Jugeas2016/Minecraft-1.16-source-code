/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.stream.Collector;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bhd
/*     */   extends cxs
/*     */ {
/*  35 */   private final Map<Integer, bhb> a = Maps.newHashMap();
/*     */   
/*     */   private final aag b;
/*     */   
/*     */   private int c;
/*     */   private int d;
/*     */   
/*     */   public bhd(aag ☃) {
/*  43 */     super(a(☃.k()));
/*  44 */     this.b = ☃;
/*  45 */     this.c = 1;
/*  46 */     b();
/*     */   }
/*     */   
/*     */   public bhb a(int ☃) {
/*  50 */     return this.a.get(Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public void a() {
/*  54 */     this.d++;
/*  55 */     Iterator<bhb> ☃ = this.a.values().iterator();
/*     */     
/*  57 */     while (☃.hasNext()) {
/*  58 */       bhb bhb = ☃.next();
/*  59 */       if (this.b.V().b(brt.x)) {
/*  60 */         bhb.n();
/*     */       }
/*  62 */       if (bhb.d()) {
/*  63 */         ☃.remove();
/*  64 */         b();
/*     */         
/*     */         continue;
/*     */       } 
/*  68 */       bhb.o();
/*     */     } 
/*     */ 
/*     */     
/*  72 */     if (this.d % 200 == 0) {
/*  73 */       b();
/*     */     }
/*     */     
/*  76 */     rz.a(this.b, this.a.values());
/*     */   }
/*     */   
/*     */   public static boolean a(bhc ☃, bhb bhb1) {
/*  80 */     if (☃ != null && bhb1 != null && bhb1.i() != null) {
/*  81 */       return (☃.aX() && ☃.eZ() && ☃.dd() <= 2400 && ☃.l.k() == bhb1.i().k());
/*     */     }
/*  83 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bhb a(aah ☃) {
/*     */     fx fx2;
/*  92 */     if (☃.a_()) {
/*  93 */       return null;
/*     */     }
/*     */     
/*  96 */     if (this.b.V().b(brt.x)) {
/*  97 */       return null;
/*     */     }
/*     */     
/* 100 */     chd chd = ☃.l.k();
/* 101 */     if (!chd.j()) {
/* 102 */       return null;
/*     */     }
/*     */     
/* 105 */     fx fx1 = ☃.cB();
/*     */ 
/*     */ 
/*     */     
/* 109 */     List<azp> list = this.b.y().c(azr.b, fx1, 64, azo.b.b).collect((Collector)Collectors.toList());
/* 110 */     int i = 0;
/* 111 */     dcn dcn = dcn.a;
/* 112 */     for (azp azp : list) {
/* 113 */       fx fx = azp.f();
/* 114 */       dcn = dcn.b(fx.u(), fx.v(), fx.w());
/* 115 */       i++;
/*     */     } 
/*     */     
/* 118 */     if (i > 0) {
/*     */       
/* 120 */       dcn = dcn.a(1.0D / i);
/* 121 */       fx2 = new fx(dcn);
/*     */     } else {
/*     */       
/* 124 */       fx2 = fx1;
/*     */     } 
/*     */     
/* 127 */     bhb bhb = a(☃.u(), fx2);
/*     */     
/* 129 */     boolean bool = false;
/* 130 */     if (!bhb.j()) {
/* 131 */       if (!this.a.containsKey(Integer.valueOf(bhb.u()))) {
/* 132 */         this.a.put(Integer.valueOf(bhb.u()), bhb);
/*     */       }
/* 134 */       bool = true;
/*     */     }
/* 136 */     else if (bhb.m() < bhb.l()) {
/* 137 */       bool = true;
/*     */     } else {
/*     */       
/* 140 */       ☃.d(apw.E);
/* 141 */       ☃.b.a(new pn(☃, (byte)43));
/*     */     } 
/*     */ 
/*     */     
/* 145 */     if (bool) {
/* 146 */       bhb.a(☃);
/* 147 */       ☃.b.a(new pn(☃, (byte)43));
/*     */       
/* 149 */       if (!bhb.c()) {
/* 150 */         ☃.a(aea.az);
/* 151 */         ac.I.a(☃);
/*     */       } 
/*     */     } 
/*     */     
/* 155 */     b();
/*     */     
/* 157 */     return bhb;
/*     */   }
/*     */   
/*     */   private bhb a(aag ☃, fx fx1) {
/* 161 */     bhb bhb = ☃.b_(fx1);
/* 162 */     return (bhb != null) ? bhb : new bhb(e(), ☃, fx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 167 */     this.c = ☃.h("NextAvailableID");
/* 168 */     this.d = ☃.h("Tick");
/*     */     
/* 170 */     mj mj = ☃.d("Raids", 10);
/* 171 */     for (int i = 0; i < mj.size(); i++) {
/* 172 */       md md1 = mj.a(i);
/* 173 */       bhb bhb = new bhb(this.b, md1);
/* 174 */       this.a.put(Integer.valueOf(bhb.u()), bhb);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public md b(md ☃) {
/* 180 */     ☃.b("NextAvailableID", this.c);
/* 181 */     ☃.b("Tick", this.d);
/*     */     
/* 183 */     mj mj = new mj();
/* 184 */     for (bhb bhb : this.a.values()) {
/* 185 */       md md1 = new md();
/* 186 */       bhb.a(md1);
/* 187 */       mj.add(md1);
/*     */     } 
/* 189 */     ☃.a("Raids", mj);
/* 190 */     return ☃;
/*     */   }
/*     */   
/*     */   public static String a(chd ☃) {
/* 194 */     return "raids" + ☃.a();
/*     */   }
/*     */   
/*     */   private int e() {
/* 198 */     return ++this.c;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bhb a(fx ☃, int i) {
/* 203 */     bhb bhb = null;
/* 204 */     double d = i;
/* 205 */     for (bhb bhb1 : this.a.values()) {
/* 206 */       double d1 = bhb1.t().j(☃);
/* 207 */       if (!bhb1.v()) {
/*     */         continue;
/*     */       }
/* 210 */       if (d1 < d) {
/* 211 */         bhb = bhb1;
/* 212 */         d = d1;
/*     */       } 
/*     */     } 
/* 215 */     return bhb;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bhd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */