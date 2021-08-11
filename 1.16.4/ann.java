/*     */ import java.lang.management.ManagementFactory;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import javax.management.Attribute;
/*     */ import javax.management.AttributeList;
/*     */ import javax.management.DynamicMBean;
/*     */ import javax.management.JMException;
/*     */ import javax.management.MBeanAttributeInfo;
/*     */ import javax.management.MBeanInfo;
/*     */ import javax.management.MalformedObjectNameException;
/*     */ import javax.management.ObjectName;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ann
/*     */   implements DynamicMBean
/*     */ {
/*  30 */   private static final Logger a = LogManager.getLogger();
/*     */   private final MinecraftServer b;
/*     */   
/*     */   private ann(MinecraftServer ☃) {
/*  34 */     this
/*     */ 
/*     */       
/*  37 */       .d = (Map<String, a>)Stream.<a>of(new a[] { new a("tickTimes", this::b, "Historical tick times (ms)", long[].class), new a("averageTickTime", this::a, "Current average tick time (ms)", long.class) }).collect(Collectors.toMap(☃ -> a.b(☃), Function.identity()));
/*     */ 
/*     */     
/*  40 */     this.b = ☃;
/*     */ 
/*     */ 
/*     */     
/*  44 */     MBeanAttributeInfo[] arrayOfMBeanAttributeInfo = (MBeanAttributeInfo[])this.d.values().stream().map(☃ -> a.c((a)☃)).toArray(☃ -> new MBeanAttributeInfo[☃]);
/*     */     
/*  46 */     this.c = new MBeanInfo(ann.class.getSimpleName(), "metrics for dedicated server", arrayOfMBeanAttributeInfo, null, null, new javax.management.MBeanNotificationInfo[0]);
/*     */   }
/*     */   private final MBeanInfo c; private final Map<String, a> d;
/*     */   public static void a(MinecraftServer ☃) {
/*     */     try {
/*  51 */       ManagementFactory.getPlatformMBeanServer().registerMBean(new ann(☃), new ObjectName("net.minecraft.server:type=Server"));
/*     */ 
/*     */     
/*     */     }
/*  55 */     catch (MalformedObjectNameException|javax.management.InstanceAlreadyExistsException|javax.management.MBeanRegistrationException|javax.management.NotCompliantMBeanException jMException) {
/*  56 */       a.warn("Failed to initialise server as JMX bean", jMException);
/*     */     } 
/*     */   }
/*     */   
/*     */   private float a() {
/*  61 */     return this.b.aO();
/*     */   }
/*     */   
/*     */   private long[] b() {
/*  65 */     return this.b.h;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object getAttribute(String ☃) {
/*  71 */     a a = this.d.get(☃);
/*  72 */     return (a == null) ? null : 
/*     */       
/*  74 */       a.a(a).get();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAttribute(Attribute ☃) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AttributeList getAttributes(String[] ☃) {
/*  88 */     List<Attribute> list = (List<Attribute>)Arrays.<String>stream(☃).map(this.d::get).filter(Objects::nonNull).map(☃ -> new Attribute(a.b(☃), a.a(☃).get())).collect(Collectors.toList());
/*  89 */     return new AttributeList(list);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public AttributeList setAttributes(AttributeList ☃) {
/*  95 */     return new AttributeList();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object invoke(String ☃, Object[] arrayOfObject, String[] arrayOfString) {
/* 102 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public MBeanInfo getMBeanInfo() {
/* 107 */     return this.c;
/*     */   }
/*     */   
/*     */   static final class a {
/*     */     private final String a;
/*     */     private final Supplier<Object> b;
/*     */     private final String c;
/*     */     private final Class<?> d;
/*     */     
/*     */     private a(String ☃, Supplier<Object> supplier, String str1, Class<?> clazz) {
/* 117 */       this.a = ☃;
/* 118 */       this.b = supplier;
/* 119 */       this.c = str1;
/* 120 */       this.d = clazz;
/*     */     }
/*     */     
/*     */     private MBeanAttributeInfo a() {
/* 124 */       return new MBeanAttributeInfo(this.a, this.d.getSimpleName(), this.c, true, false, false);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ann.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */